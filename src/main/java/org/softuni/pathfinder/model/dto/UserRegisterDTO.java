package org.softuni.pathfinder.model.dto;

public record UserRegisterDTO(
        String username,
        String fullName,
        String email,
        Integer age,
        String password,
        String confirmPassword) {
}
