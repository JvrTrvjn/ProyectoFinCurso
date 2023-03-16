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
    @GetMapping("/user/{id}")
    public User showUserByID(@PathVariable Integer userId){
        return userService.showUserByID(userId);
    }

    @PostMapping("/user/{id}")
    public void saveUser(@RequestBody User newUser){
        userService.saveUser(newUser);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUserByID(@PathVariable Integer userId){
        userService.deleteUserByID(userId);
    }
    @PutMapping("/user/{id}")
    public void update(@RequestBody User updateUser, @PathVariable Integer userId){
        userService.saveUser(User.builder()
                .userID(userId)
                .dni(updateUser.getDni())
                .nombre(updateUser.getNombre())
                .apellido(updateUser.getApellido())
                .email(updateUser.getEmail()).build());
    }

}
