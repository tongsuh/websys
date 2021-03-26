package com.example.server.entity;

import lombok.Data;
import java.util.List;

@Data
public class User {
    private long id;
    private String username;
    private String password;
    private List<Role> roles;
}
