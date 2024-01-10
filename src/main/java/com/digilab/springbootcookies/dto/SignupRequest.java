package com.digilab.springbootcookies.dto;

import java.util.Set;

import com.digilab.springbootcookies.models.Role;

import jakarta.validation.constraints.*;

public class SignupRequest {

    @NotBlank
    @Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters")
    private String username;

    private Set<Role> roles;

    @NotBlank
    @Size(min = 4, max = 120, message = "Password must be between 4 and 120 characters")
    private String password;

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

    public Set<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}