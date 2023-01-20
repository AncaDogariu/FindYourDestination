package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TimisoaraActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timisoara);

     //   getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton buttonCatedrala = (ImageButton) findViewById(R.id.imageButton);
        ImageButton buttonOpera = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton buttonUnirii = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton buttonMuzeu = (ImageButton) findViewById(R.id.imageButton5);
        final Context context = this;
        ImageButton buttonBack = (ImageButton) findViewById(R.id.imageButton6);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
        buttonCatedrala.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, CatedralaActivity.class);
                startActivity(intent);
            }
        });
        buttonOpera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, OperaActivity.class);
                startActivity(intent);
            }
        });
        buttonUnirii.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, UniriiActivity.class);
                startActivity(intent);
            }
        });
        buttonMuzeu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, MuzeuActivity.class);
                startActivity(intent);
            }
        });
    }





}
