package com.example.academic.system.services;

import com.example.academic.system.model.Student;
import com.example.academic.system.model.StudentDto;

import java.util.Optional;

public interface StudentService {
    Student createStudent(StudentDto dto);
    Optional<Student> getStudentById(Long id);
    Student updateStudent(Long id, StudentDto dto);
    String deleteStudent(Long id);
}
