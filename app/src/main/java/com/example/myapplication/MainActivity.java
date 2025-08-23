package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button addNoteButton;
    Button aboutMeButton;
    Button submitTextNote;
    Button addButton,browseButton;
    ImageView logo;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        browseButton = findViewById(R.id.button5);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

        logo = findViewById(R.id.imageView);
        logo.setImageResource(R.drawable.note);
        addNoteButton = findViewById(R.id.button);
        addNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click");
                Intent aboutMe = new Intent(getApplicationContext(),AddNoteActivity.class);
                startActivity(aboutMe);
            }
        });
        browseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);

                new Thread(()->{
                    try{
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    runOnUiThread(()->{
                                progressBar.setVisibility(View.GONE);
                                Intent addIntent = new Intent(getApplicationContext(),BrowseNoteActivity.class);
                                startActivity(addIntent);
                            }
                    );
                }).start();
            }
        });
        aboutMeButton = findViewById(R.id.button2);
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(), AboutmeActivity.class);
                startActivity(aboutMe);
            }
        });


    }
}