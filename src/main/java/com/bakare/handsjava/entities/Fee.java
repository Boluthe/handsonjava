package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

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
    @jakarta.persistence.Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    // Getters and Setters
}
