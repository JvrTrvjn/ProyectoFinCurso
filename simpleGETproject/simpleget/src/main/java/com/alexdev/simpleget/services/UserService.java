package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.User;

import java.util.List;

public interface UserService {

    public List<User> showAllByDniOrEmail();

    public User showUserByID(Long userID);

    public void saveUser(User newUser);

    public void deleteUserByID(Long userId);
}
