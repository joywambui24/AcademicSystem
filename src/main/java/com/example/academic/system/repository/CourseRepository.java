package com.example.academic.system.repository;

import com.example.academic.system.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,  Long> {

}