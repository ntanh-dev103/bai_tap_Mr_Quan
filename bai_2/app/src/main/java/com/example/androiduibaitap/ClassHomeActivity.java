package com.example.androiduibaitap;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClassHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_home);

        LinearLayout boxStudents = findViewById(R.id.boxStudents);
        LinearLayout boxTeachers = findViewById(R.id.boxTeachers);
        LinearLayout boxSubjects = findViewById(R.id.boxSubjects);
        LinearLayout boxStats = findViewById(R.id.boxStats);

        boxStudents.setOnClickListener(v -> startActivity(new Intent(this, StudentListActivity.class)));
        boxTeachers.setOnClickListener(v -> Toast.makeText(this, "Màn hình Giảng viên", Toast.LENGTH_SHORT).show());
        boxSubjects.setOnClickListener(v -> Toast.makeText(this, "Màn hình Môn học", Toast.LENGTH_SHORT).show());
        boxStats.setOnClickListener(v -> Toast.makeText(this, "Màn hình Thống kê", Toast.LENGTH_SHORT).show());
    }
}
