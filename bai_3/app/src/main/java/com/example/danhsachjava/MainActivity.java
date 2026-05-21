package com.example.danhsachjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btnRecyclerView;
    private Button btnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecyclerView = findViewById(R.id.btnRecyclerView);
        btnListView = findViewById(R.id.btnListView);

        btnRecyclerView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProductRecyclerActivity.class);
            startActivity(intent);
        });

        btnListView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubjectListViewActivity.class);
            startActivity(intent);
        });
    }
}
