package com.choi.model.repository;

import java.util.List;

import com.choi.model.dto.User;

public interface UserRepository {
    List<User> selectAllUsers();
}
