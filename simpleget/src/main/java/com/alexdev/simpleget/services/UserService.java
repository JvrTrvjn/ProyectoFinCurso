package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User getUserById(Long userId);

    public void saveUser(User newUser);

    public void deleteUserById(Long userId);
}
