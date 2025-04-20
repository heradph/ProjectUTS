package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usernameEditText = findViewById(R.id.editUsername);
        Button loginBtn = findViewById(R.id.btnLogin);

        loginBtn.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });
    }
}