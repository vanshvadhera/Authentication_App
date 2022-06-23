package com.example.chattingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Signinbutton;
    Button Signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Signinbutton = findViewById(R.id.Signinbutton);
        Signupbutton = findViewById(R.id.Signupbutton);
        Intent UPintent = new Intent(this, SignUp.class);
        Intent INintent = new Intent(this, Sign_In.class);

        Signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(INintent);
            }
        });
        Signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(UPintent);
            }
        });

    }
}