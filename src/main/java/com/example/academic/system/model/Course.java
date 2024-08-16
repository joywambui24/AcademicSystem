package com.example.academic.system.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="courseCode")
    private String courseCode;

    @Column(name="courseName")
    private String courseName;

    @Column(name="credits")
    private String credits;

    @Column (name="location")
    private String location;

    public Course(long id, String courseCode, String courseName, String credits, String location) {
        this.id = id;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.location = location;
    }
}
