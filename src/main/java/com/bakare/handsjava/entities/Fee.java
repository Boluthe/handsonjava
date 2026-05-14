package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Fee {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    @ManyToOne

    @JoinColumn(name = "student_id")
    private Student student;
    private BigDecimal amountPaid;
    private Date paymentDate;
    private String paymentStatus;
    
    // Getters and Setters
}
