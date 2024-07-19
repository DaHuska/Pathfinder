package org.softuni.pathfinder.util;

import org.softuni.pathfinder.model.User;
import org.softuni.pathfinder.model.enums.LevelType;
import org.springframework.stereotype.Component;

@Component
public class CurrentUser {
    private String username;

    private String fullName;

    private String email;

    private LevelType levelType;

    private boolean isLogged;

    public void login(User user) {
        setUsername(user.getUsername());
        setFullName(user.getFullName());
        setEmail(user.getEmail());
        setLevelType(user.getLevel());
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

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }
}
