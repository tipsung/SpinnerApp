package com.example.tipsung.spinnerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");
        TextView textName = (TextView) findViewById(R.id.textView3);
        textName.setText(name);

        String studentID = intent.getStringExtra("studentID");
        TextView textStudentID = (TextView) findViewById(R.id.textView5);
        textStudentID.setText(studentID);

        String grad = intent.getStringExtra("grad");
        TextView textGrad = (TextView) findViewById(R.id.textView7);
        textGrad.setText(grad);

    }
}
