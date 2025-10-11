package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public  class HomeController {

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("pageTitle", "Maria Okpe | Backend Developer");
        return "portfolio/index";
    }

    @GetMapping("/about")
    public  String aboutPage(Model model){
        model.addAttribute("pageTitle", "About Me | Maria Okpe");
        return  "portfolio/about";
    }

    /*@GetMapping("/projects")
    public String projectPage(Model model){
        model.addAttribute("ProjectTitle", "Projects | Java & Spring MVC Work");
        return "portfolio/projects";
    }*/

//    @GetMapping("/contact")
//    public String contactPage(Model model){
//        model.addAttribute("ContactTitle", "Contact Me | Let's Connect");
//        return "portfolio/contact";
//    }
}