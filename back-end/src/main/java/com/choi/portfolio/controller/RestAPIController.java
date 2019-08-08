package com.choi.controller;

import com.choi.model.dto.User;
import com.choi.model.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestAPIController {
    private static final Logger logger = LoggerFactory.getLogger(RestAPIController.class);

    @Autowired
    UserService userService;

    @GetMapping("/users")
    List<User> getAllUsers() {
        List<User> resultUsers = userService.selectAllUsers();
        logger.info("모든 사용자 조회: {}", resultUsers);
        return resultUsers;
    }
}
