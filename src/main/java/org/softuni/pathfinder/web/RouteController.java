package org.softuni.pathfinder.web;

import ch.qos.logback.core.model.Model;
import org.softuni.pathfinder.model.dto.RouteCreateDTO;
import org.softuni.pathfinder.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/routes")
public class RouteController {

    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping()
    public String routes() {
        return "routes";
    }

    @GetMapping("/details/{id}")
    public String routes(@PathVariable("id") Long id, Model model) {
        return "route-details";
    }

    @GetMapping("/add")
    public String add() {
        return "add-route";
    }

    @PostMapping("/add")
    public String add(RouteCreateDTO routeCreateDTO) {
        routeService.addRoute(routeCreateDTO);

        return "redirect:/routes";
    }
}
