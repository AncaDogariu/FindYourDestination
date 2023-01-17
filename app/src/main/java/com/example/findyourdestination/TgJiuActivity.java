package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TgJiuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tg_jiu);


        ImageButton buttonColoana = (ImageButton) findViewById(R.id.imageButton);
        ImageButton buttonMasaTacerii = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton buttonCentru= (ImageButton) findViewById(R.id.imageButton3);
        ImageButton buttonPoartaSarutului = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton buttonBack = (ImageButton) findViewById(R.id.imageButton6);
        final Context context = this;
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, activity_search.class);
                startActivity(intent);
            }
        });
        buttonColoana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, ActivityColoana.class);
                startActivity(intent);
            }
        });
        buttonMasaTacerii.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, ActivityMasaTacerii.class);
                startActivity(intent);
            }
        });
        buttonCentru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, ActivityCentru.class);
                startActivity(intent);
            }
        });
        buttonPoartaSarutului.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, ActivityPoarta.class);
                startActivity(intent);
            }
        });
    }
}