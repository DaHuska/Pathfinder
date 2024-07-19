package org.softuni.pathfinder.service;

import org.softuni.pathfinder.model.dto.UserLoginDTO;
import org.softuni.pathfinder.model.dto.UserRegisterDTO;

public interface UserService {
    boolean loginUser(UserLoginDTO userLoginDTO);

    boolean registerUser(UserRegisterDTO userRegisterDTO);
}
