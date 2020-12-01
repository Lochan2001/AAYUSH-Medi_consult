package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class SymptomsActivity extends AppCompatActivity {
    private TextView txtWelcome;
    Button soscallform;
    Button contactbutton;
    ListView itemList;
    String[] Symptoms = {"Fever", "Vomiting", "Nausea", "Sweating", "Headache", "Dry Cough", "Chest pain",
            "Blurred Vision", "Indigestion", "Frequent urination",
            "Diarrhoea /Constipation", "Weakness /fatigue", "Stomach Ache"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        getSupportActionBar().setTitle("Symptoms");
        itemList = findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Symptoms);
        itemList.setAdapter(adapter);

        String strUsername = getIntent().getStringExtra("Username");
        txtWelcome = findViewById(R.id.txt_welcome);
        txtWelcome.setText("Welcome " + strUsername + " Select Symptoms");


        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), fever.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), vomiting.class);
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), nausea.class);
                    startActivity(intent);
                }

                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), sweating.class);
                    startActivity(intent);
                }

                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), headache.class);
                    startActivity(intent);
                }

                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), dry_cough.class);
                    startActivity(intent);
                }

                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), chest_pain.class);
                    startActivity(intent);
                }

                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), blurred_vision.class);
                    startActivity(intent);
                }

                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), indigestion.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), frequent_urination.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), diarrhoea_constipation.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), weakness_fatigue.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), stomach_ache.class);
                    startActivity(intent);
                }

            }

        });

        soscallform=findViewById(R.id.btn_soscall);
        soscallform.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i=new Intent(SymptomsActivity.this,sos_call_Activity.class);
                startActivity(i);
            }

        });
        contactbutton=findViewById(R.id.btn_doctorcontact);
        contactbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i=new Intent(SymptomsActivity.this,contact_doctor_Activity.class);
                startActivity(i);
            }

        });
    }

}