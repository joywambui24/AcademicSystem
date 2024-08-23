package com.example.academic.system.controller;

import com.example.academic.system.model.Student;
import com.example.academic.system.model.StudentDto;
import com.example.academic.system.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/createStudent", produces = "application/json", consumes = "application/json")
    public Student createStudent(@RequestBody @Validated StudentDto Dto){
        return studentService.createStudent(Dto);
    }

    @GetMapping(value = "/getById", produces = "application/json")
    public Optional<Student> getById(@RequestParam Long id) {
        return studentService.getStudentById(id);
    }
    @PutMapping(value = "/updateStudent", produces = "application/json", consumes= "application/json")
    public Student updateStudent(@RequestParam Long id,  @RequestBody @Validated StudentDto dto){
        return studentService.updateStudent(id, dto);
    }
    @DeleteMapping(value= "/delete")
    public String deleteStudent(@RequestParam Long id){
        return studentService.deleteStudent(id);
    }



}
