package com.example.androiduibaitap;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        EditText edtName = findViewById(R.id.edtName);
        EditText edtBirth = findViewById(R.id.edtBirth);
        EditText edtClass = findViewById(R.id.edtClass);
        EditText edtEmail = findViewById(R.id.edtEmail);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnCancel = findViewById(R.id.btnCancel);

        btnSave.setOnClickListener(v -> {
            String name = edtName.getText().toString().trim();
            String birth = edtBirth.getText().toString().trim();
            String studentClass = edtClass.getText().toString().trim();
            String email = edtEmail.getText().toString().trim();

            if (name.isEmpty() || birth.isEmpty() || studentClass.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Đã nhấn Lưu sinh viên", Toast.LENGTH_SHORT).show();
            }
        });

        btnCancel.setOnClickListener(v -> finish());
    }
}
