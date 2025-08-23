package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;

public class AddNoteActivity extends AppCompatActivity {

    Button submitTextNote;
    TextView showNote;
    EditText titleOfTextNote, contentOfTextNote, userNameInput, userIdInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        submitTextNote = findViewById(R.id.button4);
        titleOfTextNote = findViewById(R.id.editTextUserName);
        contentOfTextNote = findViewById(R.id.editTextUserId);
        userNameInput = findViewById(R.id.editTextUserName);
        userIdInput = findViewById(R.id.editTextUserId);
        showNote = findViewById(R.id.textView2);

        submitTextNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strOfTitle = titleOfTextNote.getText().toString();
                String strOfContent = contentOfTextNote.getText().toString();
                String strOfDate = new Date().toString();

                String strUserName = userNameInput.getText().toString();
                String strUserId = userIdInput.getText().toString();

                // สร้าง User (เป็น PremiumUser ตัวอย่าง)
                User noteOwner = new PremiumUser(strUserName, strUserId, true);

                // สร้าง Note และกำหนด Owner
                TextNote textNote1 = new TextNote(strOfTitle, strOfDate, strOfContent);
                textNote1.setOwner(noteOwner);

                // แสดงผล
                showNote.setText(textNote1.display());
            }
        });
    }
}
