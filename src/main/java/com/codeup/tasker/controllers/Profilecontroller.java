package com.codeup.tasker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Profilecontroller {
    @GetMapping("/profile")
    public String Profile(){
        return"Profile";
    }
}
