package com.example.academic.system.services;

import com.example.academic.system.model.Course;
import com.example.academic.system.model.CourseDto;


import java.util.Optional;

public interface CourseService {

    Course createCourse(CourseDto dto);
    Optional<Course>  getCourseById(Long id);
    Course updateCourse(Long id, CourseDto dto);
    String deleteCourse(Long id);
}




