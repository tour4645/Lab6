package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BrowseNoteActivity extends AppCompatActivity {

    Button Button;
    EditText titleOfTextNote, contentOfTextNote;
    TextView showNote;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_browse_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        titleOfTextNote = findViewById(R.id.editTextText3);
        progressBar = findViewById(R.id.progressBar2);
        showNote = findViewById(R.id.textView6);
        Button = findViewById(R.id.button5);

        progressBar.setVisibility(View.GONE);
        showNote.setVisibility(View.GONE);




        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(view.VISIBLE);
                showNote.setVisibility(View.GONE);
                new Thread(() -> {
                    try{
                        Thread.sleep(2000);
                    }catch (Exception e){
                        throw new RuntimeException(e);
                    }
                    runOnUiThread(()->{
                        progressBar.setVisibility(View.GONE);
                        showNote.setVisibility(View.VISIBLE);

                    });
                }).start();

            }
        });



    }
}