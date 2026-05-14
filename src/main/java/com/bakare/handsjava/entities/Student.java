package com.bakare.handsjava.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String classGrade;
    private Date enrollmentDate;
    private String parent;
    // Getters and Setters
}
