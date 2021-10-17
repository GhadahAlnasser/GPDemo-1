package com.example.gpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
    }
    public void ShowMapLandmarks(View v) {

        Intent myIntent = new Intent(getBaseContext(), AdminMapPage.class);
        startActivity(myIntent);
    }
    public void goToEditLandmarksPage(View v) {

        Intent myIntent = new Intent(getBaseContext(), EditLandmarks.class);
        startActivity(myIntent);
    }
    public void goToUploadLandmarksPage(View v) {

        Intent myIntent = new Intent(getBaseContext(), UploadMapPage.class);
        startActivity(myIntent);
    }
}