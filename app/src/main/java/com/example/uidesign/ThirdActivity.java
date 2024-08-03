package com.example.uidesign;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String AGE = "AGE";
    private TextView nameText, ageText;
    private String name;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third);
        nameText = findViewById(R.id.name);
        ageText = findViewById(R.id.age);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        age=i.getIntExtra(AGE, 0);
        nameText.setText("Hi  "  +  name);
        ageText.setText("Your Age is "  + age);
    }
}