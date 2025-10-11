package com.example.demo.model;

public class Project {
    private String title;
    private  String description;
    private  String technologies;
    private  String githubLink;

    //constructor
    public Project(String title, String description, String technologies, String githubLink){
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.githubLink = githubLink;
    }

    // Getters — allow Thymeleaf to read the values in your HTML.
    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return  description;
    }

    public String getTechnologies(){
        return technologies;
    }

    public String getGithubLink(){
        return githubLink;
    }
}
