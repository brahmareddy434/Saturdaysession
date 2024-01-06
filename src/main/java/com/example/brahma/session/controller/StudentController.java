package com.example.brahma.session.controller;

import com.example.brahma.session.entity.Student;
import com.example.brahma.session.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/studentname")
    public String studentname() {
        return "Brahma reddy";
    }

    @PostMapping("/savestudent")
    public String savestudent(@RequestBody Student student) {
        return service.savestudent(student);
    }
}
