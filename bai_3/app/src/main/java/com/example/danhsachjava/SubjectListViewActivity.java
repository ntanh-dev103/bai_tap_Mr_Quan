package com.example.danhsachjava;

import android.app.Activity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SubjectListViewActivity extends Activity {

    private EditText edtSubjectName;
    private Button btnAddSubject;
    private Button btnClearAll;
    private ListView listViewSubjects;

    private ArrayList<String> subjectList;
    private ArrayAdapter<String> subjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_listview);

        edtSubjectName = findViewById(R.id.edtSubjectName);
        btnAddSubject = findViewById(R.id.btnAddSubject);
        btnClearAll = findViewById(R.id.btnClearAll);
        listViewSubjects = findViewById(R.id.listViewSubjects);

        subjectList = new ArrayList<>();
        subjectList.add("Lập trình Java");
        subjectList.add("Cơ sở dữ liệu");
        subjectList.add("Thiết kế giao diện Android");

        subjectAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                subjectList
        );

        listViewSubjects.setAdapter(subjectAdapter);

        btnAddSubject.setOnClickListener(v -> addSubject());
        btnClearAll.setOnClickListener(v -> clearAllSubjects());

        listViewSubjects.setOnItemClickListener((parent, view, position, id) -> {
            String selectedSubject = subjectList.get(position);
            Toast.makeText(
                    SubjectListViewActivity.this,
                    "Bạn đã chọn: " + selectedSubject,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }

    private void addSubject() {
        String subjectName = edtSubjectName.getText().toString().trim();

        if (subjectName.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập tên môn học hợp lệ", Toast.LENGTH_SHORT).show();
            return;
        }

        subjectList.add(subjectName);
        subjectAdapter.notifyDataSetChanged();
        edtSubjectName.setText("");
        edtSubjectName.requestFocus();
        hideKeyboard();

        Toast.makeText(this, "Đã thêm môn học: " + subjectName, Toast.LENGTH_SHORT).show();
    }

    private void clearAllSubjects() {
        if (subjectList.isEmpty()) {
            Toast.makeText(this, "Danh sách đã rỗng", Toast.LENGTH_SHORT).show();
            return;
        }

        subjectList.clear();
        subjectAdapter.notifyDataSetChanged();
        Toast.makeText(this, "Đã xóa tất cả môn học", Toast.LENGTH_SHORT).show();
    }

    private void hideKeyboard() {
        InputMethodManager inputMethodManager =
                (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

        if (inputMethodManager != null && getCurrentFocus() != null) {
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }
}
