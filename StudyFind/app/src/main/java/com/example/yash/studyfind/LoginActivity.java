package com.example.yash.studyfind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v){
        EditText userNameField = (EditText) findViewById(R.id.etUsername);
        Intent intent = new Intent(getApplicationContext(), Home.class);
        intent.putExtra("username", userNameField.getText().toString());
        startActivity(intent);
    }
}
