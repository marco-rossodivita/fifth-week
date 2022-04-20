package com.corso.java.branimusicali;

import java.util.Set;

public class CD {

    private Long id;
    private String cdCode;
    private Set<Object> songs;
    private Archive archive;

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }


    public Set<Object> getSongs() {
        return songs;
    }

    public void setSongs(Set<Object> songs) {
        this.songs = songs;
    }


    public CD() {}

    public CD(String cdCode) {
        this.cdCode = cdCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCdCode() {
        return cdCode;
    }

    public void setCdCode(String cdCode) {
        this.cdCode = cdCode;
    }
}
