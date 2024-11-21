package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id){
        return userRepository.findById(null).get();
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.findByName(name).get();
    }

    @Override
    public User saveUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public Void deleteUser(Long id) {
      userRepository.deleteById(id);
      return null;
    }

    @Override
    public List<User> listAllUsers() {
        return userRepository.findAll();        
    }
    
}
