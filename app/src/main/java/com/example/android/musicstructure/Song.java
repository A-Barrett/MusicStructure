package com.example.android.musicstructure;

public class Song {

    private String Song;
    private String Artist;

    public Song(String song, String artist) {
        Song = song;
        Artist = artist;
    }

    public String getSong() {
        return Song;
    }

    public String getArtist() {
        return Artist;
    }
}

