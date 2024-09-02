package org.example.behavioural.visitor;

public interface Visitor {

    String exhibit(Song song);
    String exhibit(Album album);
}
