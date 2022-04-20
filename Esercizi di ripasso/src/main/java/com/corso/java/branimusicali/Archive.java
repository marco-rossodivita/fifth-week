package com.corso.java.branimusicali;

import java.util.ArrayList;
import java.util.Set;

public class Archive {

    private Long id;
    private String archiveName;
    private Set<Object> cds;
    private Set<Artist> artists;

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public String getArchiveName() {
        return archiveName;
    }

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    public Archive(){}

    public Set<Object> getCds() {
        return cds;
    }

    public void setCds(Set<Object> cds) {
        this.cds = cds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
