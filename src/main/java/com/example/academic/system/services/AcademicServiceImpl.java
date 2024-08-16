package com.example.academic.system.services;

import com.example.academic.system.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademicServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;




}
