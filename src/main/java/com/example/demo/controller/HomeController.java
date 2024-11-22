package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Departments;
import com.example.demo.entities.User;
import com.example.demo.services.DpService;
import com.example.demo.services.UserService;
import org.springframework.ui.Model;
import java.util.List; 

@Controller
public class HomeController {

    private final UserService userService;
    private final DpService dpService;
    
    @Autowired
    public HomeController(UserService userService,DpService dpService) {
        this.userService = userService;
        this.dpService = dpService;
    }
    
    @GetMapping("/")
    public String index(Model model) {
        List<User> users = userService.listAllUsers();
        model.addAttribute("users", users);

        List<Departments> dp = dpService.listAllDepartments();
        model.addAttribute("dp", dp);
        return "index";
    }

}
