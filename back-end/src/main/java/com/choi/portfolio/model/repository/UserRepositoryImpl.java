package com.choi.portfolio.model.repository;

import com.choi.portfolio.model.dto.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);
    private static final String ns = "com.choi.portfolio.model.mapper.User.";

    @Autowired
    SqlSessionTemplate template;

    @Override
    public List<User> selectAllUsers() {
        String statement = ns + "selectAllUsers";
        return template.selectList(statement);
    }
}
