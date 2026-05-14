package com.bakare.handsjava.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String title;
    private String author;
    private String isbn;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private Date issueDate;
    private Date returnDate;

    // Getters and Setters
    public Library() {
    }
    public Library(String title, String author, String isbn) {}
    public Long getBookId() {
        return bookId;
    }
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
}
