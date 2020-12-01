package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SignupActivity extends AppCompatActivity {
    TextView signin;
    private EditText edEmail;
    private EditText edUsername;
    private EditText edPassword;
    private EditText edConfirmPassowrd;
    private Button btnCreateUser;

    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("Sign_up");

        signin=findViewById(R.id.signin);
        edEmail =findViewById(R.id.emailEdit);
        edUsername = findViewById(R.id.usernameEdit);
        edPassword = findViewById(R.id.passwordEdit);
        edConfirmPassowrd = findViewById(R.id.confirmpasswordEdit);
        btnCreateUser = findViewById(R.id.btn_sign);
        btnCreateUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strPassword = edPassword.getText().toString();
                String strConfirmPassword = edConfirmPassowrd.getText().toString();
                String strUsername = edUsername.getText().toString();
                String strEmail =edEmail.getText().toString();

                if (strPassword != null && strConfirmPassword != null && strPassword.equalsIgnoreCase(strConfirmPassword)) {
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = credentials.edit();
                    editor.putString("Password", strPassword);
                    editor.putString("Username", strUsername);
                    editor.putString("Email",strEmail);

                    editor.commit();

                    SignupActivity.this.finish();
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
        }
    }
