package com.sample.controller;

import com.sample.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {


    @GetMapping
    public List<Student> createStudent() {

        return List.of(new Student(1,"Gurunath","10th"),new Student(2,"irshad","11th"));
    }


}
