package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginApp extends AppCompatActivity {
    LinearLayout email;
    TextView signin;
    Button Loginform;
    Button Contactus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);
        getSupportActionBar().setTitle("Medi_Consult");


        email=findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i =new Intent(LoginApp.this,SignupActivity.class);
                startActivity(i);
                                     }
                                 });

        signin=findViewById(R.id.signinwelcome);
        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginApp.this,LoginActivity.class);
                startActivity(i);
            }
        });

        Loginform=findViewById(R.id.btn_login);
        Loginform.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginApp.this,LoginActivity.class);
                startActivity(i);
            }

        });

        Contactus=findViewById(R.id.btn_contactus);
        Contactus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginApp.this,MainActivity.class);
                startActivity(i);
            }

        });

    }
}