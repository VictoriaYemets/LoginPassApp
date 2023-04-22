package com.example.getloginpassapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etLogin;
    private EditText etPassword;
    private Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin = findViewById(R.id.eTLogin);
        etPassword = findViewById(R.id.eTPassword);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent =new Intent(this, ViewActivity.class);
        intent.putExtra("login", etLogin.getText().toString());
        intent.putExtra("password", etPassword.getText().toString());
        startActivity(intent);
    }
}