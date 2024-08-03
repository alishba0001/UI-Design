package com.example.uidesign;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class MainActivity extends AppCompatActivity {
//    EditText etUsername,etPassword;
//    String username,password;
//    AppCompatButton btnSubmit;
   private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();

            }
        });


    }
    public void openSecondActivity(){
        Intent i= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);

    }
//        etUsername = findViewById(R.id.etUserNameInput);
//        etPassword = findViewById(R.id.etPasswordInput);
//
//        btnSubmit = findViewById(R.id.btnLogin);
//
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                String text = "456";
////                int length = text.length();
////                String output = text.substring(0,length-2);
//                // Integer.valueOf(etUsername.getText().toString());
//                username = etUsername.getText().toString();
//                password = etPassword.getText().toString();
//                Toast.makeText(MainActivity.this, username + " " + password, Toast.LENGTH_SHORT).show();
//            }
//        });


    }
