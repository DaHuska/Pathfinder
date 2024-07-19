package org.softuni.pathfinder.service.impl;

import org.softuni.pathfinder.model.User;
import org.softuni.pathfinder.model.dto.UserLoginDTO;
import org.softuni.pathfinder.repository.UserRepository;
import org.softuni.pathfinder.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean loginUser(UserLoginDTO userLoginDTO) {
        Optional<User> existingUser = userRepository.findByUsername(userLoginDTO.username());

        if (existingUser.isEmpty()) {
            return false;
        }

        //TODO:

        return true;
    }
}
