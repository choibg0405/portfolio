package com.choi.portfolio.model.repository;

import com.choi.portfolio.model.dto.User;

import java.util.List;

public interface UserRepository {
    List<User> selectAllUsers();
}
