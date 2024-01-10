package com.digilab.springbootcookies.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cRole")
public class Role {

    @Id
    private String id; // You may want to add an ID field for uniqueness

    private String role;
    private String roleType;
    private String roleGroup;
    private List<String> authorities;

    public Role() {
    }

    public Role(String role, String roleType, String roleGroup, List<String> authorities) {
        this.role = role;
        this.roleType = roleType;
        this.roleGroup = roleGroup;
        this.authorities = authorities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleGroup() {
        return roleGroup;
    }

    public void setRoleGroup(String roleGroup) {
        this.roleGroup = roleGroup;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

}