package com.codeup.tasker.controllers;

import com.codeup.tasker.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
    @GetMapping("login")
    public String Login() {
        return "Login";
    }
}

//    @PostMapping("login")
//    public String AcceptedLogin(@ModelAttribute User user){
//        return "Home";
//    }
//}
