package com.codeup.tasker.controllers;

import com.codeup.tasker.Models.User;
import com.codeup.tasker.Repos.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SignupController {


    private final UserRepo usersDao;

    public SignupController(UserRepo usersDao) {
        this.usersDao = usersDao;
    }


    @GetMapping("/signup")
    public String Login(Model model) {
        model.addAttribute("user", new User());
        return "Signup";
    }

    @PostMapping("/signup")
    public String Signup(@ModelAttribute User user) {
        usersDao.save(user);
        return "Signup";
    }
}