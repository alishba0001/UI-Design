package com.example.uidesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private EditText nameText, ageText;
    private Button button;
    private String name;
    private String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameText = findViewById(R.id.etName);
        ageText = findViewById(R.id.etAge);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }
    public void sendData() {
        name = nameText.getText().toString().trim();
        age = ageText.getText().toString().trim(); // Get age as a String

        // Ensure age is not empty before attempting to parse
        if (!age.isEmpty()) {
            Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
            i.putExtra(ThirdActivity.NAME, name);

            // Parse age to int and pass it to ThirdActivity
            try {
                int ageValue = Integer.parseInt(age);
                i.putExtra(ThirdActivity.AGE, ageValue);
            } catch (NumberFormatException e) {
                // Handle invalid age input (e.g., non-integer input)
                // You can show an error message or handle it based on your app logic
                Toast.makeText(this, "Invalid age format", Toast.LENGTH_SHORT).show();
                return; // Exit sendData() without starting ThirdActivity
            }

            startActivity(i);
        } else {
            // Handle case where age is empty
            Toast.makeText(this, "Please enter age", Toast.LENGTH_SHORT).show();
        }
    }}