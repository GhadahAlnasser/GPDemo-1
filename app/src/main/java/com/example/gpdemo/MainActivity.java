package com.example.gpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStartButtonClick(View v) {

        Intent myIntent = new Intent(getBaseContext(), UserPage.class);
        startActivity(myIntent);
    }
    public void onSwitchToAdminButtonClick(View v) {

        Intent myIntent = new Intent(getBaseContext(), UserPage.class);
        startActivity(myIntent);
    }
    }