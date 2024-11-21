package com.example.demo.controller;

import java.util.List; // 올바른 List import
import java.util.Arrays; // 올바른 Arrays import
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/model")
    public String home(Model model) {
        List<String> users = Arrays.asList("Alice", "Bob", "Charlie");
        model.addAttribute("users", users);
        return "model/index"; // 올바른 경로 반환
    }
}
