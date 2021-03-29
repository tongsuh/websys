package com.example.server.controller;

import com.example.server.bean.RespBean;
import com.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginRegController {

    @Autowired
    UserService userService;

    @RequestMapping("/check")
    public RespBean checkPassword(){

        return new RespBean();
    }


}
