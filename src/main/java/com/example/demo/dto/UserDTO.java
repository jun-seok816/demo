package com.example.demo.dto;

public class UserDTO {
    private Long id; // 사용자 ID
    private String name;
    private String email;
    private String department; // 필드 이름은 "department"로 유지

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Getters and Setters
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

    public String getDepartment() { // 메서드 이름 변경
        return department;
    }
    public void setDepartment(String department) { // 메서드 이름 변경
        this.department = department;
    }
}