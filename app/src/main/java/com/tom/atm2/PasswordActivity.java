package com.tom.atm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
    }
    public void tohome (View view){
        String username;
        Intent intent = new Intent(PasswordActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
