package com.example.androiduibaitap;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button btnBai1 = findViewById(R.id.btnBai1);
        Button btnBai2 = findViewById(R.id.btnBai2);
        Button btnBai3 = findViewById(R.id.btnBai3);
        Button btnBai4 = findViewById(R.id.btnBai4);
        Button btnBai5 = findViewById(R.id.btnBai5);

        btnBai1.setOnClickListener(v -> startActivity(new Intent(this, PersonalInfoActivity.class)));
        btnBai2.setOnClickListener(v -> startActivity(new Intent(this, LoginActivity.class)));
        btnBai3.setOnClickListener(v -> startActivity(new Intent(this, SubjectListActivity.class)));
        btnBai4.setOnClickListener(v -> startActivity(new Intent(this, ProfileTabActivity.class)));
        btnBai5.setOnClickListener(v -> startActivity(new Intent(this, ClassHomeActivity.class)));
    }
}
