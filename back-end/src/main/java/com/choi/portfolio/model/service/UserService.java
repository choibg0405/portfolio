package com.choi.model.service;

import com.choi.model.dto.User;
import com.choi.model.repository.UserRepository;

import java.util.List;

public interface UserService {
    UserRepository getUserRepository();

    List<User> selectAllUsers();
}
