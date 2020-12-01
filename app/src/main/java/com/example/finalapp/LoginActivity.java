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
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView signup;
    private EditText edUsername;
    private EditText edPassword;
    private Button btnLogin1;
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");

        signup=findViewById(R.id.signup);
        edUsername = findViewById(R.id.usernameEdit);
        edPassword = findViewById(R.id.passwordEdit);
        btnLogin1= findViewById(R.id.btn_login1);


        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(i);
            }
        });


        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                String strUsername = credentials.getString("Username", null);
                String strPassword = credentials.getString("Password", null);

                String username_from_ed = edUsername.getText().toString();
                String password_from_ed = edPassword.getText().toString();

                if (strUsername != null && username_from_ed != null && strUsername.equalsIgnoreCase(username_from_ed)) {
                    if (strPassword != null && password_from_ed != null && strPassword.equalsIgnoreCase(password_from_ed)) {

                        Intent i=new Intent(LoginActivity.this,SymptomsActivity.class);
                        i.putExtra("Username", strUsername);
                        startActivity(i);


                    } else {
                        Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}