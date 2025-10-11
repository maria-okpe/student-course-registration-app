package com.example.demo.model;

//package com.mariaokpe.portfolio.model;

// This class holds the data from your contact form (name, email, message)
public class ContactMessage {
    private String name;
    private String email;
    private String message;

    // Getters and setters (used by Spring to access form data)
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

