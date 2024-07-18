package org.softuni.pathfinder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import org.softuni.pathfinder.model.enums.CategoryType;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
    @Column
    @Enumerated(EnumType.STRING)
    private CategoryType name;

    // Very long string
    @Column
    private String description;

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