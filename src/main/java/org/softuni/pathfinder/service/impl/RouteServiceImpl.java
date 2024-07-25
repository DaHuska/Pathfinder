package org.softuni.pathfinder.service.impl;

import org.softuni.pathfinder.model.Route;
import org.softuni.pathfinder.model.User;
import org.softuni.pathfinder.model.dto.RouteCreateDTO;
import org.softuni.pathfinder.repository.RouteRepository;
import org.softuni.pathfinder.repository.UserRepository;
import org.softuni.pathfinder.service.RouteService;
import org.softuni.pathfinder.util.CurrentUser;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final UserRepository userRepository;
    private final CurrentUser currentUser;

    RouteServiceImpl(RouteRepository routeRepository, UserRepository userRepository, CurrentUser currentUser) {
        this.routeRepository = routeRepository;
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    @Override
    public boolean addRoute(RouteCreateDTO routeCreateDTO) {
        routeRepository.save(map(routeCreateDTO));

        return true;
    }

    private Route map(RouteCreateDTO routeCreateDTO) {
        User author = userRepository.findByUsername(currentUser.getUsername()).get();

        return new Route()
                .setAuthor(author)
                .setVideoURL(routeCreateDTO.videoURL())
                .setName(routeCreateDTO.name())
                .setLevel(routeCreateDTO.level());
    }
}
