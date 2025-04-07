package com.bakare.handsjava.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String subjectTaught;
    private String qualification;
    private Date hireDate;


    // Getters and Setters
}
