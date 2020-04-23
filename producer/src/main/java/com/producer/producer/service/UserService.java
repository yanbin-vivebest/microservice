package com.producer.producer.service;

import com.producer.producer.dto.User;

import java.util.List;


public interface UserService {
    List<User> getUserList();

    int insertUser(User user);
}
