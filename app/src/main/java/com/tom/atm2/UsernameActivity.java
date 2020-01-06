package com.tom.atm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class UsernameActivity extends AppCompatActivity {
    private EditText name1;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        name1 = findViewById(R.id.hname);
        name = name1.getText().toString();
    }
    public void toemail (View view){

        Intent intent = new Intent(UsernameActivity.this,EmailActivity.class);
        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        pref.edit()
                .putString("name", name)
                .commit();
        Log.d("UserM", "toemail: "+name);
        UsernameActivity.this.setResult(RESULT_OK);
        startActivityForResult(intent,1);
        finish();
    }
}
