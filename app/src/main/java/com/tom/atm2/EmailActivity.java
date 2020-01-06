package com.tom.atm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    private EditText edemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        edemail = findViewById(R.id.hemail);
    }
    public void topassword (View view){
        SharedPreferences pref = getSharedPreferences("test", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String s = edemail.getText().toString();
        editor.putString("email",s)
                .commit();
        Intent intent = new Intent(EmailActivity.this,PasswordActivity.class);
        startActivity(intent);
        finish();
    }
}
