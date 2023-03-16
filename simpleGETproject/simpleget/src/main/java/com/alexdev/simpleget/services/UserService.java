package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User showUserByID(Integer userID);

    public void saveUser(User newUser);

    public void deleteUserByID(Integer userId);
}
