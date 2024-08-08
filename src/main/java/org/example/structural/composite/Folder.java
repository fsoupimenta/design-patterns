package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemComponent {

    private List<FileSystemComponent> children;

    public Folder(String name) {
        super(name);
        this.children = new ArrayList<FileSystemComponent>();
    }

    public void add(FileSystemComponent component) {
        this.children.add(component);
    }

    public void remove(FileSystemComponent component) {
        this.children.remove(component);
    }

    public String getDetails() {
        StringBuilder details = new StringBuilder("Folder: " + this.getName() + "\n");
        for (FileSystemComponent child : children) {
            details.append(child.getDetails());
        }
        return details.toString();
    }
}