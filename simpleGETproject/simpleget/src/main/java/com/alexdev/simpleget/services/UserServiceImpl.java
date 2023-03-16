package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.User;
import com.alexdev.simpleget.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User showUserByID(Integer userId) {
        return userRepository.findByUserID(userId);
    }

    @Override
    public void saveUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public void deleteUserByID(Integer userId) {
       userRepository.deleteByUserID(userId);
    }
}
