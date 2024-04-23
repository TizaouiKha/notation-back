package com.example.notationback.serviceimp;

import com.example.notationback.model.User;
import com.example.notationback.repository.UserRepository;
import com.example.notationback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public Optional<User> getUserByMailAndPassword(String mail, String password) {
        return  userRepository.findByMailAndPassword(mail, password);
    }
}
