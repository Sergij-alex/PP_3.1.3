package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllOfController {
    @GetMapping("/")
    public String loginPage(ModelMap model) {
        return "all/login";
    }
}
