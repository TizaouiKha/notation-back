package com.example.notationback.controller;

import com.example.notationback.model.Student;
import com.example.notationback.model.User;
import com.example.notationback.service.StudentService;
import com.example.notationback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/find")
    public Optional<User> getStudentByMailAndPassword(@RequestParam String mail, String password){
        return userService.getUserByMailAndPassword(mail, password);
    }

}
