package com.alexdev.simpleget.repositorys;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<User,Long> {
    public ArrayList<User> findAllByDniOrEmail();
    public User findByUserID(Long userId);

    public void save(Book newUser);

    public void deleteByUserID(Long userId);
}
