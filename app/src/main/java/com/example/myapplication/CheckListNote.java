package com.example.myapplication;

import java.util.ArrayList;

public class CheckListNote extends Note {
    private ArrayList<String> items;

    public CheckListNote(String title, String createdDate) {
        super(title, createdDate);
        this.items = new ArrayList<>();
    }

    // Encapsulation
    public void addItem(String item) {
        items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    // Polymorphism
    @Override
    public void display() {
        System.out.println("Checklist: " + title + " (" + createdDate + ")");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("  - " + items.get(i));
        }
    }
}