package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;

@Service
public interface UserService {
    /**
     * 모든 사용자 정보를 가져옴     
     * @return     
     */
    List<User> listAllUsers();
    /**
     * 사용자의 Pk를 가져옴
     * @param id PK
     * @return 
     */
    User getUserById(Long id);
    /**
     * 사용자의 이름으로 검색
     * @param id PK
     * @return 
     */
    User getUserByName(String name);
    /**
     * 사용자 Insert
     * @param user User객체
     * @return 
     */
    User saveUser(User user);
    /**
     * 사용자 row 삭제
     * @param id Pk
     * @return
     */
    Void deleteUser(Long id);
}
