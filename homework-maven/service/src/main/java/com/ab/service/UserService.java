package com.ab.service;

import com.ab.dao.UserDao;
import com.ab.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> get(Long id) {
        return userDao.getById(id)
                .map(it -> new UserDto());
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
