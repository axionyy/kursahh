package com.example.kursachh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration3);
    }

    public void RegistrationBack2(View v) {
        Intent intent = new Intent(RegistrationActivity3.this, RegistrationActivity2.class);
        startActivity(intent);
    }

    public void ReturnAutorization(View v) {
        Toast.makeText(this, "Вы зарегистрированы!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(RegistrationActivity3.this, MainActivity.class);
        startActivity(intent);
    }
}
