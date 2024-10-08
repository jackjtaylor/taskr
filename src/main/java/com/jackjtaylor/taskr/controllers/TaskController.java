package com.jackjtaylor.taskr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jackjtaylor.taskr.model.TaskModel;

@RestController
public class TaskController {

    @GetMapping("/getTask")
    public TaskModel getTask() {
        return new TaskModel("Buy a MacBook", false);
    }

}
