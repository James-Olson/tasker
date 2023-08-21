package com.codeup.tasker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskerBoardSelectionController {
    @GetMapping("taskerboardselection")
    public String TaskerBoardSelection() {
        return "TaskerBoardSelection";
    }
}
