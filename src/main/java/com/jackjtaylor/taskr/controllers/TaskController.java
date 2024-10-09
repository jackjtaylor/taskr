package com.jackjtaylor.taskr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jackjtaylor.taskr.model.TaskModel;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TaskController {

    private Map<String, TaskModel> tasks = new HashMap<>();

    public TaskController() {
        this.tasks.put("MacBook", new TaskModel("Buy a MacBook", false));
        this.tasks.put("Headphones", new TaskModel("Look for Headphones", true));
    }

    @GetMapping("/getTask/{taskName}")
    public TaskModel getTask(@PathVariable String taskName) {
        return tasks.get(taskName);
    }

}
