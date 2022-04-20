package com.corso.java.branimusicali;

public class Song {

    private Long id;
    private String songName;
    private Long artidId;
    private CD cd;

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public Song() {}

    public Song(String songName, Long artidId) {
        this.songName = songName;
        this.artidId = artidId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Long getArtidId() {
        return artidId;
    }

    public void setArtidId(Long artidId) {
        this.artidId = artidId;
    }

}
