//package com.example.academic.system.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//
//@Data
//@Entity
//@Table(name="Course")
//public class School {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(name = "schoolName")
//    private String schoolName;
//
//    @Column(name = "address")
//    private String address;
//
//    @Column(name = "city")
//    private String city;
//
//    @Column(name = "campusType")
//    private String campusType;
//
//    public School(long id, String schoolName, String address, String city, String campusType) {
//        this.id = id;
//        this.schoolName = schoolName;
//        this.address = address;
//        this.city = city;
//        this.campusType = campusType;
//    }
//}