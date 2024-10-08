package com.jackjtaylor.taskr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getTask")
    public String getTask() {
        return "Buy a Laptop";
    }

}
