package com.example.jenkin.jenkinsdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class Controller {

    @GetMapping
    public String getUserName(){
        return "This is dummy user, you are too!";
    }
}
