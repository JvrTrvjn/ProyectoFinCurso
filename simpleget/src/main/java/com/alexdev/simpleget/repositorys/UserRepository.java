package com.alexdev.simpleget.repositorys;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<User,Long> {
    public ArrayList<User> findAll();

    public User findByUserId(Long userId);

    public void save(Book newUser);

    public void deleteByUserId(Long userId);
}
