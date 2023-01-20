package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ClujActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluj);
        final Context context = this;
        ImageButton buttonBack = (ImageButton) findViewById(R.id.imageButton6);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}