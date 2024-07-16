package org.softuni.pathfinder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.validator.constraints.Length;

import org.softuni.pathfinder.model.enums.LevelType;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @Length(min = 2)
    @Column(nullable = false, unique = true)
    private String username;

    @Length(min = 2)
    @Column(nullable = false)
    private String password;

    @Length(min = 2)
    @Column
    private String fullName;

    @Column(nullable = false)
    private String email;

    // Each user should have "User" role
    @ManyToOne(targetEntity = Role.class)
    private Role role;

    @Column(nullable = false)
    private LevelType level;

    public @Length(min = 2) String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LevelType getLevel() {
        return level;
    }

    public void setLevel(LevelType level) {
        this.level = level;
    }
}
