package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.User;
import com.alexdev.simpleget.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> showAllByDniOrEmail() {
        return userRepository.findAllByDniOrEmail();
    }

    @Override
    public User showUserByID(Long userId) {
        return userRepository.findByUserID(userId);
    }

    @Override
    public void saveUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public void deleteUserByID(Long userId) {
       userRepository.deleteByUserID(userId);
    }
}
