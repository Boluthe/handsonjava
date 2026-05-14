package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;

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
}
