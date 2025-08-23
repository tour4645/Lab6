package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // สร้าง TextNote
        TextNote textNote = new TextNote("Lecture", "2025-07-29", "Don't forget OOP homework.");
        textNote.display();
        textNote.getSummary();

        // สร้าง Checklist
        CheckListNote checklist = new CheckListNote("Grocery List", "2025-07-29");
        checklist.addItem("Milk");
        checklist.addItem("Bread");
        checklist.display();

        // สร้าง User
        PremiumUser user = new PremiumUser("Chakkaphan", "6715247016", true);
        user.showInfo();
    }
}