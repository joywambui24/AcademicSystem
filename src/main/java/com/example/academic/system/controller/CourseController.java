package com.example.academic.system.controller;


import com.example.academic.system.model.Course;
import com.example.academic.system.model.CourseDto;
import com.example.academic.system.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1/course")
public class CourseController {


    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/createCourse", produces = "application/json", consumes = "application/json")
    public Course createCourse(@RequestBody @Validated CourseDto dto) {
        return courseService.createCourse(dto);
    }

    @GetMapping(value = "/getById", produces = "application/json")
    public Optional<Course> getById(@RequestParam Long id) {
        return courseService.getCourseById(id);
    }

    @PutMapping(value = "/updateCourse", consumes = "application/json", produces = "application/json")
    public Course updateCourse(@RequestParam Long id, @RequestBody @Validated CourseDto dto) {
        return courseService.updateCourse(id, dto);
    }

    @DeleteMapping(value = "/delete")
    public String deleteCourse(@RequestParam Long id) {
        return courseService.deleteCourse(id);
    }
}
