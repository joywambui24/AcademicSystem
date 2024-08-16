//package com.example.academic.system.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//
//
//@Data
//@Entity
//@Table(name="Course")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(name = "stuName")
//    private String stuName;
//
//    @Column(name = "course")
//    private String course;
//
//    @Column(name = "department")
//    private String department;
//
//    @Column(name = "year")
//    private Integer year;
//
//    @Column(name = "campusType")
//    private String campusType;
//
//    public Student(long id, String stuName, String course, String department, String year, String campusType) {
//        this.id = id;
//        this.stuName = stuName;
//        this.course = course;
//        this.department = department;
//        this.year = Integer.valueOf(year);
//        this.campusType = campusType;
//    }
//}
//
