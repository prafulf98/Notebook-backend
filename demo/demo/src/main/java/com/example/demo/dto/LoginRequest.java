package com.example.demo.dto;

import jakarta.validation.constraints.Size;

public class LoginRequest {
    @Size(min = 7, max = 15, message = "Username must be between 7 and 15 characters")
    private String username;
    
    @Size(min = 7, max = 15, message = "Password must be between 7 and 15 characters")
    private String password;

    public LoginRequest() {}

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
