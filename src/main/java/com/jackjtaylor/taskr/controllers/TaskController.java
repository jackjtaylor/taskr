package com.jackjtaylor.taskr.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jackjtaylor.taskr.model.TaskModel;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("/addTask")
    public ResponseEntity<HttpStatus> postTask(@RequestBody TaskModel task) {
        tasks.put(task.getTaskName(), task);
        return ResponseEntity.accepted().build();
    }
}
