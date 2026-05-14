package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;
    private String className;
    private String section;
    @ManyToOne
    @JoinColumn(name = "class_teacher_id")
    private Teacher classTeacher;
    
    // Getters and Setters
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public Teacher getClassTeacher() {
        return classTeacher;
    }
    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }
    public Long getClassId() {
        return classId;
    }
    public void setClassId(Long classId) {
        this.classId = classId;
    }
}
