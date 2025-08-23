package com.example.myapplication;

public class TextNote extends Note {
    private String textContent;

    public TextNote(String title, String createdDate, String textContent) {
        super(title, createdDate);
        this.textContent = textContent;
    }

    // Encapsulation
    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    // Polymorphism
    @Override
    public String display() {
        return "TextNote: " + getTitle() + ": " + textContent + " (" + getCreatedDate() + ")";
    }
}