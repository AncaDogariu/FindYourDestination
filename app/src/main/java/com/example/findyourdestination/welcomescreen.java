package com.example.findyourdestination;

import static com.example.findyourdestination.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomescreen extends AppCompatActivity {

    Button enter;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_welcomescreen);
        enter = findViewById(id.enter);
   //     signup = findViewById(id.signup);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(welcomescreen.this, SignUpActivity.class));

            }
        });
    }
    

}