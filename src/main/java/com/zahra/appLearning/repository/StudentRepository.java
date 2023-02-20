package com.zahra.appLearning.repository;

import com.zahra.appLearning.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student ,Long> {
}
