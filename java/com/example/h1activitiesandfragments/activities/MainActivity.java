package com.example.h1activitiesandfragments.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.h1activitiesandfragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startSecondActivity(View view) {
        Intent theIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(theIntent);
    }
}