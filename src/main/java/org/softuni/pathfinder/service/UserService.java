package org.softuni.pathfinder.service;

import org.softuni.pathfinder.model.dto.UserLoginDTO;

public interface UserService {
    boolean loginUser(UserLoginDTO userLoginDTO);
}
