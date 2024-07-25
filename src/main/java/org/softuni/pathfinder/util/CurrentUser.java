package org.softuni.pathfinder.util;

import org.softuni.pathfinder.model.Role;
import org.softuni.pathfinder.model.User;
import org.softuni.pathfinder.model.enums.LevelType;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class CurrentUser {
    private Long id;

    private String username;

    private String fullName;

    private String email;

    private Integer age;

    private LevelType levelType;

    private List<Role> roles;

    private boolean isLogged;

    public void login(User user) {
        setId(user.getId());
        setUsername(user.getUsername());
        setAge(user.getAge());
        setFullName(user.getFullName());
        setEmail(user.getEmail());
        setLevelType(user.getLevel());
        setRole(user.getRoles());
        setLogged(true);
    }

    public void logout() {
        setId(null);
        setAge(null);
        setUsername(null);
        setFullName(null);
        setEmail(null);
        setLevelType(null);
        setLogged(false);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public List<Role> getRole() {
        return roles;
    }

    public void setRole(List<Role> roles) {
        this.roles = roles;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }
}
