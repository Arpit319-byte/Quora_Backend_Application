package com.example.Quora_Backend_Application.controller;

import com.example.Quora_Backend_Application.models.User;
import com.example.Quora_Backend_Application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
        User user = userService.getUserById(userId);

        if (user != null)
            return new ResponseEntity<>(user, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long userId) {
        if (userService.deleteUserById(userId))
            return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
        else
            return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User user){

        User user1=userService.updateUser(userId,user);

        if(user1!=null)
            return new ResponseEntity<>(user1,HttpStatus.OK);
        else
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

    }
}
