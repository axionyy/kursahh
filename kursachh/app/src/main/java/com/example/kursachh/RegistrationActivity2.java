package com.example.kursachh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration2);
    }

    public void RegistrationBack1(View v) {
        Intent intent = new Intent(RegistrationActivity2.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void RegistrationNextPage3(View v) {
        Intent intent = new Intent(RegistrationActivity2.this, RegistrationActivity3.class);
        startActivity(intent);
    }

}
