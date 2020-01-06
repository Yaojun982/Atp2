package com.tom.atm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class UsernameActivity extends AppCompatActivity {
    private EditText name1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        name1 = findViewById(R.id.hname);
    }
    public void toemail (View view){
        SharedPreferences pref = getSharedPreferences("test", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String name = name1.getText().toString();
        editor.putString("name", name)
                .commit();
        Log.d("UserM", "toemail: "+name);
        UsernameActivity.this.setResult(RESULT_OK);
        Intent intent = new Intent(UsernameActivity.this,EmailActivity.class);
        startActivity(intent);
        finish();
    }
}
