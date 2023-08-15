package com.codeup.tasker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskBoardController {
    @GetMapping("taskerboard")
    public String TaskerBoard() {
        return "TaskerBoard";
    }
}
