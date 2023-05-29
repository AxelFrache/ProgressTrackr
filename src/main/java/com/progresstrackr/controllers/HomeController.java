package com.progresstrackr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Bonjour, c'est ma première application Spring Boot avec Thymeleaf !");
        return "home";
    }
}
