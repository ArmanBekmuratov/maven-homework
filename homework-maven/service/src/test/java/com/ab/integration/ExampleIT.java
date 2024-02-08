package com.ab.integration;


import com.ab.ServiceRunner;
import com.ab.dao.UserDao;
import com.ab.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExampleIT {

    private final UserService userService = new UserService();
    private final UserDao userDao = new UserDao();

    @Test
    public void checkOptionalIsEmpty() {
        var optionalUser = userDao.getById(1L);
        assertTrue(optionalUser.isEmpty());
    }

    @Test
    public void checkSumAndMultiply() {
        ServiceRunner serviceRunner = new ServiceRunner();
        int multiply = serviceRunner.multiply(2, 2);
        int sum = userService.sum(2, 2);

        assertEquals(multiply, sum);
    }

}
