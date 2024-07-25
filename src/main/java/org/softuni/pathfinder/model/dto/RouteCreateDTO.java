package org.softuni.pathfinder.model.dto;

import org.softuni.pathfinder.model.enums.LevelType;

public record RouteCreateDTO(
        String name,
        String description,
        LevelType level,
        String videoURL) {

}
