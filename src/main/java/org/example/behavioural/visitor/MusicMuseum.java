package org.example.behavioural.visitor;

public class MusicMuseum implements Visitor {

    private static final MusicMuseum instance = new MusicMuseum();

    private MusicMuseum() {}

    public static MusicMuseum getInstance() {
        return instance;
    }

    public String exhibit(Music music) {
        return music.accept(this);
    }

    @Override
    public String exhibit(Song song) {
        return convertToJson(song.getTitle(), song.getArtist());
    }

    @Override
    public String exhibit(Album album) {
        return convertToJson(album.getTitle(), album.getArtist());
    }

    private String convertToJson(String title, String artist) {
        return "{\n  \"title\": \"" + title + "\",\n  \"artist\": \"" + artist + "\"\n}";
    }
}
