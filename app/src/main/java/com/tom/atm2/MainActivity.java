package com.tom.atm2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_REQUIST = 110;
    private static final String TAG =  MainActivity.class.getSimpleName();
    private EditText useremail;
    private EditText userpassword;
    private EditText username1;
    private String string_username;
    private String string_useremail;
    private String string_userpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        username1 = findViewById(R.id.username);
        useremail = findViewById(R.id.useremail);
        userpassword = findViewById(R.id.userpassword);
        string_username = username1.getText().toString();
        string_useremail = useremail.getText().toString();
        string_userpassword = userpassword.getText().toString();

    }






    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_REQUIST) {
            if (resultCode == RESULT_OK) {
                SharedPreferences pref= getSharedPreferences("test", Context.MODE_PRIVATE);
                String s = pref.getString("name","");
                String a = pref.getString("email","");
                String p = pref.getString("password","");
                Log.d(TAG, "onActivityResult: "+s+","+a+","+p);
                username1.setText(s+"");
                useremail.setText(a+"");
                userpassword.setText(p+"");
            }
        }

    }

    public void regist(View view) {
        if (string_username.equals("")&&string_useremail.equals("")&&string_userpassword.equals("") ) {
            Intent intent = new Intent(MainActivity.this, UsernameActivity.class);
            startActivityForResult(intent, REQUEST_CODE_REQUIST);
        }else{

        }
    }
}