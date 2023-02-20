package com.zahra.appLearning.service;

import com.zahra.appLearning.entity.Student;
import com.zahra.appLearning.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return List.of(
                new Student(UUID.randomUUID(),"zahra","benmohamed","benmedzahra20@gmail.com", Student.Gender.FEMALE),
                new Student(UUID.randomUUID(),"zakaria","benmohamed","zakaria.bnemed@outlook.com", Student.Gender.MALE)

        );
    }
}
