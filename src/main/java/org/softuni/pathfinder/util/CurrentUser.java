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
    private String username;

    private String fullName;

    private String email;

    private LevelType levelType;

    private List<Role> roles;

    private boolean isLogged;

    public void login(User user) {
        setUsername(user.getUsername());
        setFullName(user.getFullName());
        setEmail(user.getEmail());
        setLevelType(user.getLevel());
        setRole(user.getRoles());
        setLogged(true);
    }

    public void logout() {
        setUsername(null);
        setFullName(null);
        setEmail(null);
        setLevelType(null);
        setLogged(false);
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
