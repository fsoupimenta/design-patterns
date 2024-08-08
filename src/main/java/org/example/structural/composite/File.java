package org.example.structural.composite;

public class File extends FileSystemComponent {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDetails() {
        return "File: " + this.getName() + " - Size: " + this.size + "KB\n";
    }
}