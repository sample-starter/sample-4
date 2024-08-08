package org.example.sql.service;

import org.example.sql.entities.User;
import org.example.sql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

}
