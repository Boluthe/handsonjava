package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;
    private String subjectName;
    private String subjectCode;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classId;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    // Getters and Setters
}
