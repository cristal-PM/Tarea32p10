package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText nom,city,status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nom=(EditText)findViewById(R.id.editTextTextPersonName);
        city=(EditText) findViewById(R.id.editTextTextPersonName2);
        status=(EditText) findViewById(R.id.editTextTextPersonName3);
        String datos=getIntent().getStringExtra("dato");
        String dato1=getIntent().getStringExtra("dato1");
        String dato2=getIntent().getStringExtra("dato2");


        nom.setText(datos);
        city.setText(dato1);
        status.setText(dato2);

    }
}