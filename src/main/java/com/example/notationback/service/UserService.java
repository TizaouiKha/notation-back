package com.example.notationback.service;

import com.example.notationback.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserByMailAndPassword(String mail, String password);
}
