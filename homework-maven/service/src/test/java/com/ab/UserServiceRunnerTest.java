package com.ab;

import com.ab.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceRunnerTest {

    @Test
    public void testMultiply() {
        ServiceRunner serviceRunner = new ServiceRunner();
        int result = serviceRunner.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void checkSum() {
        UserService userService = new UserService();
        int result = userService.sum(2, 3);
        assertEquals(5, result);
    }
}