package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class activitymain2 extends AppCompatActivity {
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_2);
        TextView textView3 = findViewById(R.id.textview3);
        textView3.setTextColor(Color.parseColor("#1CCB3D"));

        name=findViewById(R.id.textview3);

        String text = getIntent().getStringExtra("keyname");

        name.setText(text);
    }
}