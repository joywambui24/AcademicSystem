package com.example.academic.system.model;

import jakarta.persistence.*;
import lombok.Data;




@Data
@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "stuName")
    private String stuName;

    @Column(name = "course")
    private String course;

    @Column(name = "department")
    private String department;

    @Column(name = "year")
    private String year;

    @Column(name = "campusType")
    private String campusType;

    public Student() {
    }

    public Student(String stuName, String course, String department, String year, String campusType) {
        this.stuName = stuName;
        this.course = course;
        this.department = department;
        this.year = year;
        this.campusType = campusType;
    }
}

