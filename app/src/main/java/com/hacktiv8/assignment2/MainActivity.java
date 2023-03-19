package com.hacktiv8.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Hacktiv8";
    private TextView tv;
    private Button btnCount;

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCount = findViewById(R.id.btnSubmit);
        tv = findViewById(R.id.tvCounter);

        counter = 0;

        btnCount.setOnClickListener((v) -> {
            counter++;
            tv.setText("" + counter);
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //Add information for saving HelloToast counter
        //to the to the outState bundle
        outState.putInt("key_counter", counter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getInt(String.valueOf(savedInstanceState));
        counter = savedInstanceState.getInt("key_counter", 0);
        tv.setText("" + counter);
        }
    }