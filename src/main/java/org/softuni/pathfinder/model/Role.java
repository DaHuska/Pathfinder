package org.softuni.pathfinder.model;

import jakarta.persistence.*;

import org.softuni.pathfinder.model.enums.RoleType;

import java.util.List;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleType name;

    @ManyToMany
    private List<User> users;

    public RoleType getName() {
        return name;
    }

    public void setName(RoleType name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
