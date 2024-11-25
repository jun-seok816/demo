package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departments;
import com.example.demo.repositories.DpPepository;

@Service
public class DpServiceImpl implements DpService {
    @Autowired
    private DpPepository dpPepository;

    @Override
    public List<Departments> listAllDepartments(){
        return dpPepository.findAll();
    }

    @Override
    public Departments getDpById(Long id){
        return dpPepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Department not found"));
    }
}
