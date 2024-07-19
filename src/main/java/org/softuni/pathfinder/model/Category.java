package org.softuni.pathfinder.model;

import jakarta.persistence.*;
import org.softuni.pathfinder.model.enums.CategoryType;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
    @Column
    @Enumerated(EnumType.STRING)
    private CategoryType name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    private List<Route> routes;

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public CategoryType getName() {
        return name;
    }

    public void setName(CategoryType name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}