package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timetableId;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classId;
    private String dayOfWeek;
    private Integer periodNumber;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @jakarta.persistence.Id
    private Long id;


    // Getters and Setters
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
