package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classId;
    private Date date;
    private String status;


    // Getters and Setters
}
