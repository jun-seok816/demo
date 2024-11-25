package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Departments;

@Service
public interface DpService {
    /**
     * 모든 사용자 정보를 가져옴     
     * @return     
     */
    List<Departments> listAllDepartments();

    /**
     * 사용자의 Pk를 가져옴
     * @param id PK
     * @return 
     */
    Departments getDpById(Long id);
}
