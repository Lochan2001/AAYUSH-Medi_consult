package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class contact_doctor_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_doctor_);
        getSupportActionBar().setTitle("Consult_Doctor");
        TextView testview1 =findViewById(R.id.contacttodoc);
        testview1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}