package org.softuni.pathfinder.service;

import org.softuni.pathfinder.model.dto.RouteCreateDTO;

public interface RouteService {
    boolean addRoute(RouteCreateDTO routeCreateDTO);
}
