package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Mendapatkan data dari FormActivity melalui Intent
        Intent intent = getIntent();
        String dataFromForm = intent.getStringExtra("input_data");

        TextView listData = findViewById(R.id.txtListData);
        listData.setText("Data: " + dataFromForm);

        findViewById(R.id.btnBackList).setOnClickListener(v -> finish());
    }
}
