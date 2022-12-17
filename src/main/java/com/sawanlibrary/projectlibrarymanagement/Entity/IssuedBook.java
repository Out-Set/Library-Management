package com.sawanlibrary.projectlibrarymanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class IssuedBook {

    @Id
    @GeneratedValue
    private int id;

    private int bookId;
    private String status;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public IssuedBook(int bookId, String status, int userId) {
        this.bookId = bookId;
        this.status = status;
        this.userId = userId;
    }

    public IssuedBook(){

    }
}
