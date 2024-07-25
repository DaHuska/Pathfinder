package org.softuni.pathfinder.model;

import jakarta.persistence.*;
import org.softuni.pathfinder.model.enums.LevelType;

import java.util.List;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {
    @Column(columnDefinition = "TEXT")
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

    @ManyToMany(targetEntity = Category.class, mappedBy = "routes")
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public Route setCategories(List<Category> categories) {
        this.categories = categories;

        return this;
    }

    public String getGpx() {
        return gpx;
    }

    public Route setGpx(String gpx) {
        this.gpx = gpx;

        return this;
    }

    public LevelType getLevel() {
        return level;
    }

    public Route setLevel(LevelType level) {
        this.level = level;

        return this;
    }

    public String getName() {
        return name;
    }

    public Route setName(String name) {
        this.name = name;

        return this;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public Route setVideoURL(String videoURL) {
        this.videoURL = videoURL;

        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Route setAuthor(User author) {
        this.author = author;

        return this;
    }
}
