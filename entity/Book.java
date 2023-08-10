package com.javan.perpustakaan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private String bookName;

    private String bookDetail;

    public Book() {
    }

    public Book(Long bookId, String bookName, String bookDetail) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDetail = bookDetail;
    }

    public Book( String bookName, String bookDetail) {
        this.bookName = bookName;
        this.bookDetail = bookDetail;
    }

    public Long getBookdId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }
}
