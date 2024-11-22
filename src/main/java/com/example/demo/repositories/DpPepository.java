package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Departments;

public interface DpPepository extends JpaRepository<Departments,Long> {
    
}
