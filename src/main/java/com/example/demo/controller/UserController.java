package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.UserDTO;
import com.example.demo.entities.Departments;
import com.example.demo.entities.User;
import com.example.demo.services.DpService;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/users") // 기본 경로 설정
public class UserController {
    private final UserService userService;
    private final DpService dpService;

    @Autowired
    public UserController(UserService userService,DpService dpService) {
        this.dpService = dpService;
        this.userService = userService;
    }

    // 새로운 사용자 생성
    @PostMapping("/new")
    public String createUser(@ModelAttribute UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        // String -> Long 변환 요즘 form을 누가쓰냐
        Long departmentId = Long.parseLong(userDTO.getDepartment());
        Departments dp = dpService.getDpById(departmentId);        

        user.setDepartment(dp);
        
        userService.saveUser(user);

        // JavaScript로 새로고침
        return "<script>window.location.href='/'</script>";
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody UserDTO userDTO) {
        // 기존 사용자 조회
        User user = userService.getUserById(userDTO.getId());
        if (user == null) {
            // 사용자 없음 처리
            return "<script>alert('User not found'); window.location.href='/';</script>";
        }

        // 사용자 정보 업데이트
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        Long departmentId = Long.parseLong(userDTO.getDepartment());
        Departments dp = dpService.getDpById(departmentId);
        user.setDepartment(dp);

        // 업데이트 저장
        userService.saveUser(user);        
        return "good";
    }

    // 이름으로 사용자 조회
    @GetMapping("/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }

    // 사용자 삭제
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "사용자 삭제완료";
    }
}
