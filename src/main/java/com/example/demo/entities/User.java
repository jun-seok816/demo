package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 테이블의 'id' 컬럼

    private String name; // 테이블의 'name' 컬럼
    private String email; // 테이블의 'email' 컬럼
    private Long departments_key;//테이블의 'departments_key' 컬럼

    // 기본 생성자
    public User() {}

    // Getter와 Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void departments_key(Long departments_key){
        this.departments_key = departments_key;
    }

    public Long setDepartments_key(){
        return departments_key;
    }
}
