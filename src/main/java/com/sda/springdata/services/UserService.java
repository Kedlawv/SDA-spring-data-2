package com.sda.springdata.services;

import com.sda.springdata.dao.UserRepository;
import com.sda.springdata.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserRepository repository;
    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> getUsers() {
        List<User> userList = new ArrayList<User>();
        repository.findAll().forEach(userList::add);
        return userList;
    }
}
