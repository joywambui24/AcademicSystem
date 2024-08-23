package com.example.academic.system.services;

import com.example.academic.system.model.School;
import com.example.academic.system.model.SchoolDto;
import com.example.academic.system.model.Student;
import com.example.academic.system.model.StudentDto;
import com.example.academic.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent (StudentDto Dto){
        Student student= new Student(
                Dto.stuName, Dto.department, Dto.course, Dto.year, Dto.campusType
        );
        return studentRepository.save(student);
    }
    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }


    @Override
    public Student updateStudent(Long id, StudentDto dto) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            Student data = student.get();
            data.setStuName(dto.stuName);
            data.setCourse(dto.course);
            data.setDepartment(dto.department);
            data.setYear(dto.year);
            data.setCampusType(dto.campusType);
            return studentRepository.save(data);
        }
        return null;

    }
    @Override
    public String deleteStudent(Long id){
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent())
        {
            Student data = student.get();
            studentRepository.deleteById(data.getId());
            return "This student" + data.getStuName() + "doesn't exist";
        }
        return"";
    }

}
