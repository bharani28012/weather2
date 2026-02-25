package com.example.weather.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
public class TaskController {
    @GetMapping("/tasks")
    public String getTasks() {
        return "data retrieved successfully!";
    }
    @RequestMapping(method = RequestMethod.POST, path = "/tasks")
    public String createTask() {
        return "data created successfully!";
    }   


}
