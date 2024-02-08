package com.ab;

import com.ab.service.UserService;

public class ServiceRunner {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.get(1L));

    }

    public int multiply(int a, int b) {
        return a * b;
    }
}