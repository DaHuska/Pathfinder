package org.softuni.pathfinder.model;

import jakarta.persistence.*;

import org.softuni.pathfinder.model.enums.RoleType;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleType name;

    public RoleType getName() {
        return name;
    }

    public void setName(RoleType name) {
        this.name = name;
    }
}
