package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText to, subject, mesage;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linier_layout);

        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        mesage = findViewById(R.id.message);
        send = findViewById(R.id.send);
    }
}