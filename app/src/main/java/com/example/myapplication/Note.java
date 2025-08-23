package com.example.myapplication;

public abstract class Note {
    protected String title;
    protected String createdDate;

    public Note(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    // Encapsulation
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    // Abstraction
    public abstract void display();

    public void getSummary() {
        System.out.println("Summary: " + title + " (" + createdDate + ")");
    }
}