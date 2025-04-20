package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        EditText inputData = findViewById(R.id.editInputData);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        String username = getIntent().getStringExtra("username");

        btnSubmit.setOnClickListener(v -> {
            String data = inputData.getText().toString();

            // Mengirim data ke ListActivity
            Intent intent = new Intent(FormActivity.this, HomeActivity.class);
            intent.putExtra("input_data", data);
            intent.putExtra("username", username);
            startActivity(intent);
        });

        findViewById(R.id.btnBackForm).setOnClickListener(v -> finish());
    }
}

