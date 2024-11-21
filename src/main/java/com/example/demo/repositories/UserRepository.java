package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    // 메서드 이름 기반 쿼리
    Optional<User> findByName(String name);
}
