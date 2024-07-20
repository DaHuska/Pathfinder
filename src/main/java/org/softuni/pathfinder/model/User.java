package org.softuni.pathfinder.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

import org.softuni.pathfinder.model.enums.LevelType;
import org.softuni.pathfinder.model.enums.RoleType;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
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
    private Integer age;

    @Column(nullable = false)
    private String email;

    // Each user should have "User" role
    @ManyToMany(targetEntity = Role.class, mappedBy = "users")
    private List<Role> roles;

    @Column(nullable = false)
    private LevelType level;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;

        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;

        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;

        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;

        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;

        return this;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public User setRoles(List<Role> roles) {
        this.roles = roles;

        return this;
    }

    public LevelType getLevel() {
        return level;
    }

    public User setLevel(LevelType level) {
        this.level = level;

        return this;
    }
}
