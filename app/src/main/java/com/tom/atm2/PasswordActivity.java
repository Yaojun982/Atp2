package com.tom.atm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity {

    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        password = findViewById(R.id.hpassword);
    }
    public void tohome (View view){
        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        SharedPreferences.Editor editor= pref.edit();
        String useremail = password.getText().toString();
        editor.putString("password",useremail).commit();
        finish();
    }
}
