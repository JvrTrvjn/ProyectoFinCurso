package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.User;
import com.alexdev.simpleget.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public void saveUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public void deleteUserById(Long userId) {
       //userRepository.deleteByUserId(userId);
       User user = userRepository.findById(userId)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + userId));
            userRepository.delete(user);
            //return "deleted user with id:"+id;

    }
}
