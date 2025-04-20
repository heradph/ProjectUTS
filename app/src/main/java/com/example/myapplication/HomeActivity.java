package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String username = getIntent().getStringExtra("username");
        TextView welcomeText = findViewById(R.id.txtWelcome);
        welcomeText.setText("Selamat datang, " + username + "!");

        String data = getIntent().getStringExtra("input_data");

        findViewById(R.id.btnToList).setOnClickListener(v -> {
            Intent intent = new Intent(this, ListActivity.class);
            intent.putExtra("input_data", data);
            startActivity(intent);
        });
        findViewById(R.id.btnToForm).setOnClickListener(v -> {
            Intent intent = new Intent(this, FormActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });

        findViewById(R.id.btnToProfile).setOnClickListener(v -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });
    }
}