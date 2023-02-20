package com.zahra.appLearning.controller;

import com.zahra.appLearning.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(UUID.randomUUID(),"zahra","benmohamed","benmedzahra20@gmail.com", Student.Gender.FEMALE),
                new Student(UUID.randomUUID(),"zakaria","benmohamed","zakaria.bnemed@outlook.com", Student.Gender.MALE)

        );
    }
}
