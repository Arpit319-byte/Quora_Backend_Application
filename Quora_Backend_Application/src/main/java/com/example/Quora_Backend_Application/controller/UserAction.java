package com.example.Quora_Backend_Application.controller;

import com.example.Quora_Backend_Application.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserAction {

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId) {
        return null;
    }
}
