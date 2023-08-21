package com.codeup.tasker.controllers;

import com.codeup.tasker.Models.User;
import com.codeup.tasker.Repos.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {


    private final UserRepo usersDao;

    public UserController(UserRepo usersDao) {
        this.usersDao = usersDao;
    }


    @GetMapping("login")
    public String Login() {
        return "Login";
    }

    @PostMapping("signup")
    public String Signup(){
        usersDao.save(User);
        return "/";
    }
}

