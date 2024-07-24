package org.softuni.pathfinder.service.impl;

import org.softuni.pathfinder.model.Role;
import org.softuni.pathfinder.model.User;
import org.softuni.pathfinder.model.dto.UserLoginDTO;
import org.softuni.pathfinder.model.dto.UserRegisterDTO;
import org.softuni.pathfinder.model.enums.LevelType;
import org.softuni.pathfinder.model.enums.RoleType;
import org.softuni.pathfinder.repository.UserRepository;
import org.softuni.pathfinder.service.UserService;
import org.softuni.pathfinder.util.CurrentUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    @Override
    public boolean loginUser(UserLoginDTO userLoginDTO) {
        Optional<User> existingUser = userRepository.findByUsername(userLoginDTO.username());

        if (existingUser.isEmpty()) {
            return false;
        }

        currentUser.login(existingUser.get());

        return true;
    }

    @Override
    public boolean registerUser(UserRegisterDTO userRegisterDTO) {
        if (!userRegisterDTO.password().equals(userRegisterDTO.confirmPassword())) {
            return false;
        }

        Optional<User> existingUser = userRepository.findByUsername(userRegisterDTO.username());

        if (existingUser.isPresent()) {
            return false;
        }

        userRepository.save(map(userRegisterDTO));

        return true;
    }

    @Override
    public void logoutUser() {
        currentUser.logout();
    }

    private User map(UserRegisterDTO userRegisterDTO) {
        return new User()
                .setUsername(userRegisterDTO.username())
                .setEmail(userRegisterDTO.email())
                .setFullName(userRegisterDTO.fullName())
                .setAge(userRegisterDTO.age())
                .setPassword(userRegisterDTO.password())
                .setRoles(new ArrayList<Role>(RoleType.USER.ordinal()))
                .setLevel(LevelType.BEGINNER);
    }
}
