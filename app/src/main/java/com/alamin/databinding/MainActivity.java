package com.alamin.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.alamin.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.tvHeading.setText("Al-Amin Islam");
        binding.tvSubHeading.setText("Android Developer");
        getSupportFragmentManager().beginTransaction().replace(R.id.main_panel,new FirstFragment()).commit();
    }
}