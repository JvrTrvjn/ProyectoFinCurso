package com.alexdev.simpleget.controllers;

import com.alexdev.simpleget.entity.User;
import com.alexdev.simpleget.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers () {
        return userService.getUsers();
    }
    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping("/user/{userId}")
    public void saveUser(@RequestBody User newUser){
        userService.saveUser(newUser);
    }
    @DeleteMapping("/user/{userId}")
    public void deleteUserById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }
    @PutMapping("/user/{userId}")
    public void updateUser(@RequestBody User updateUser, @PathVariable Long userId){
        userService.saveUser(User.builder()
                .userId(userId)
                .dni(updateUser.getDni())
                .nombre(updateUser.getNombre())
                .apellido(updateUser.getApellido())
                .email(updateUser.getEmail()).build());
    }

}
