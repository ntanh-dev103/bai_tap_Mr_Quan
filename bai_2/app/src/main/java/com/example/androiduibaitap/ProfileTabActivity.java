package com.example.androiduibaitap;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class ProfileTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_tab);

        Button btnInfo = findViewById(R.id.btnInfo);
        Button btnHistory = findViewById(R.id.btnHistory);
        Button btnSetting = findViewById(R.id.btnSetting);

        loadFragment(new InfoFragment());

        btnInfo.setOnClickListener(v -> loadFragment(new InfoFragment()));
        btnHistory.setOnClickListener(v -> loadFragment(new HistoryFragment()));
        btnSetting.setOnClickListener(v -> loadFragment(new SettingFragment()));
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}
