package com.tom.atm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }
    public void topassword (View view){
        String username;
        Intent intent = new Intent(EmailActivity.this,PasswordActivity.class);
        startActivity(intent);
        finish();
    }
}
