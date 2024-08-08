package org.example.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTest {

    @Test
    void shouldReturnSystemDetails() {
        Folder rootFolder = new Folder("Root");

        Folder documentsFolder = new Folder("Documents");
        File file1 = new File("Resume.docx", 500);
        documentsFolder.add(file1);

        Folder photosFolder = new Folder("Photos");
        File file2 = new File("Vacation.jpg", 300);
        photosFolder.add(file2);

        rootFolder.add(documentsFolder);
        rootFolder.add(photosFolder);

        OperatingSystem os = new OperatingSystem(rootFolder);

        assertEquals("Folder: Root\n" +
                "Folder: Documents\n" +
                "File: Resume.docx - Size: 500" + "KB\n" +
                "Folder: Photos\n" +
                "File: Vacation.jpg - Size: 300" + "KB\n", os.getSystemDetails());
    }

    @Test
    void shouldThrowExceptionWhenNoRootFolder() {
        try {
            OperatingSystem os = new OperatingSystem(null);
            os.getSystemDetails();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Operating system has no root directory", e.getMessage());
        }
    }
}