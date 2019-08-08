package com.choi.portfolio.model.service;

import com.choi.portfolio.model.dto.User;
import com.choi.portfolio.model.repository.UserRepository;

import java.util.List;

public interface UserService {
    UserRepository getUserRepository();

    List<User> selectAllUsers();
}
