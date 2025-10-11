package com.example.demo.controller;


import com.example.demo.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProjectController {

    @GetMapping("/projects")
    public  String ProjectPag(Model model){
        List<Project> project = new ArrayList<>();

        project.add(new Project(
                "Student-Course Management System",
                "A Spring MVC Java web application that manages students and courses, using clean architecture principles.",
                "Java, Spring Boot, Spring MVC, Thymeleaf, Lombok, UUID, H2 Database",
                "https://github.com/maria-okpe/student-course-registration-app"
        ));

        // You can add more projects later
        project.add(new Project(
                "Portfolio Website",
                "A personal portfolio site built with Spring Boot, Thymeleaf, and CSS.",
                "Java, Spring Boot, Thymeleaf, HTML, CSS",
                "#"
        ));

        // Pass the project list to Thymeleaf template.
        model.addAttribute("projects", project);
        model.addAttribute("pageTitle", "My Projects");

        // Return the template name (projects.html)
        return "portfolio/projects";
    }
}
