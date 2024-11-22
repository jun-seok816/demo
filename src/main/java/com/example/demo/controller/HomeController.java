package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.ui.Model;
import java.util.List; 

@Controller
public class HomeController {

    private final UserService userService;
    
    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/")
    public String index(Model model) {
        List<User> users = userService.listAllUsers();
        model.addAttribute("users", users);
        return "index";
    }

}
