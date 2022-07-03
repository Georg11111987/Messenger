package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondMainActivity2 extends AppCompatActivity {
private TextView secondTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main2);
        Intent intent = getIntent();
        String textMsg = intent.getStringExtra("msg");
        secondTextView = findViewById(R.id.SecondTextView);
        secondTextView.setText(textMsg);


    }
}