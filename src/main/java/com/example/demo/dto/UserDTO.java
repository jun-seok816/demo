package com.example.demo.dto;

public class UserDTO {
    private String name;
    private String email;
    private String department; // 필드 이름은 "department"로 유지

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