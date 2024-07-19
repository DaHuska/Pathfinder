package org.softuni.pathfinder.web;

import org.softuni.pathfinder.model.dto.UserLoginDTO;
import org.softuni.pathfinder.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(UserLoginDTO userLoginDTO) {
        boolean isLoginSuccess = userService.loginUser(userLoginDTO);

        if (!isLoginSuccess) {
            return "login";
        }

        return "index";
    }
}
