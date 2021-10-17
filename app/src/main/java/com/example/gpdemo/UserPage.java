package com.example.gpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);
    }
    //when "log in as admin" is clicked
    public void onSwitchToAdminButtonClick(View v) {

        Intent myIntent = new Intent(getBaseContext(), AdminPage.class);
        startActivity(myIntent);
    }
}