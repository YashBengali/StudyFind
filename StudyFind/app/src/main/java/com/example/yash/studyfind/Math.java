package com.example.yash.studyfind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        Button b = (Button) findViewById(R.id.linearEquations);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button userNameField = (Button) findViewById(R.id.linearEquations);
                Intent intent = new Intent(getApplicationContext(), LinearEquationPage.class);
                startActivity(intent);
            }
        });
    }
}
