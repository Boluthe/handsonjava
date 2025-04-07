package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;
    private String examType;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classId;
    @jakarta.persistence.Id
    private Long id;


    public Class getClassId() {
        return classId;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getters and Setters
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
