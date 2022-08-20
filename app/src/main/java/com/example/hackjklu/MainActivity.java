package com.example.hackjklu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button signup;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = (Button)findViewById(R.id.signup);
        login = (Button)findViewById(R.id.login);



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent nextPage = new Intent(MainActivity.this , signUp.class);
                startActivity( nextPage );
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent nextPage = new Intent(MainActivity.this , loginPage.class);
            }
        });

    }

}