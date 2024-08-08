package org.example.structural.composite;

public class OperatingSystem {

    private FileSystemComponent root;

    public OperatingSystem(FileSystemComponent root) {
        this.root = root;
    }

    public String getSystemDetails() {
        if (this.root == null) {
            throw new NullPointerException("Operating system has no root directory");
        }
        return this.root.getDetails();
    }
}