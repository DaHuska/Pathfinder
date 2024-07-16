package org.softuni.pathfinder.model;

import jakarta.persistence.*;
import org.softuni.pathfinder.model.enums.LevelType;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {
    //Very long text
    @Column
    private String gpx;

    @Column
    @Enumerated(EnumType.STRING)
    private LevelType level;

    @Column
    private String name;

    @Column
    private String videoURL;

    @ManyToOne
    private User author;

    public String getGpx() {
        return gpx;
    }

    public void setGpx(String gpx) {
        this.gpx = gpx;
    }

    public LevelType getLevel() {
        return level;
    }

    public void setLevel(LevelType level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
