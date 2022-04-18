package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btnsubmit);
        name=findViewById(R.id.edt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = name.getText().toString();
                Intent intent=new Intent(MainActivity.this,activitymain2.class);
                intent.putExtra("keyname",text);
                startActivity(intent);
            }
        });
    }


}