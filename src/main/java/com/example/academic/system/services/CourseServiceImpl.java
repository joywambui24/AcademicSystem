package com.example.academic.system.services;

import com.example.academic.system.model.Course;
import com.example.academic.system.model.CourseDto;
import com.example.academic.system.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(CourseDto dto) {
        Course course = new Course(
                dto.courseCode, dto.courseName, dto.credits, dto.location
        );
        return courseRepository.save(course);

    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course updateCourse(Long id, CourseDto dto) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isPresent()) {
            Course data = course.get();
            data.setCourseCode(dto.courseCode);
            data.setCourseName(dto.courseName);
            data.setCredits(dto.credits);
            data.setLocation(dto.location);
            return courseRepository.save(data);
        }
        return null;
    }

    @Override
    public String deleteCourse(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isPresent()) {
            Course data = course.get();
            courseRepository.deleteById(data.getId());
            return "Course id " + data.getId() + " is deleted";
        }

        return "";
    }
}




