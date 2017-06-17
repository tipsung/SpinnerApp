package com.example.tipsung.spinnerapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {


    String yourName;
    String studentID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinnerGrad = (Spinner) findViewById(R.id.spinnergrad);
        final String[] grad = getResources().getStringArray(R.array.grad_arrays);
        ArrayAdapter<String> adapterGrad = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, grad);
        spinnerGrad.setAdapter(adapterGrad);

       /* spinnerGrad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, countries[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button buttonGrad = (Button) findViewById(R.id.button);
        buttonGrad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String MyGrad = spinnerGrad.getSelectedItem().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Grad");
                builder.setMessage(MyGrad);
                builder.show();

                //Toast.makeText(MainActivity.this, countryName, Toast.LENGTH_LONG).show();
            }
        });
    }*/

    }

    public void sendData(View view) {
        EditText editTextName = (EditText) findViewById(R.id.yourName);
        EditText editTextStudentID = (EditText) findViewById(R.id.studentID);
        Spinner editTextGrad = (Spinner) findViewById(R.id.spinnergrad);

        String yourName = editTextName.getText().toString();
        String studentID = editTextStudentID.getText().toString();
        String grad = editTextGrad.getSelectedItem().toString();


        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("yourName", yourName);
        intent.putExtra("studentID", studentID);
        intent.putExtra("grad", grad);
        startActivity(intent);
    }
}
