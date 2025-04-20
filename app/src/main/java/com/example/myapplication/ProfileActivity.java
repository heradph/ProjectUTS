package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String username = getIntent().getStringExtra("username");
        TextView usernameText = findViewById(R.id.txtUsername);
        TextView emailText = findViewById(R.id.txtEmail);
        usernameText.setText("Username: " + username);
        emailText.setText("Email: " + username + "@gmail.com");

        findViewById(R.id.btnBackProfile).setOnClickListener(v -> finish());
    }
}
