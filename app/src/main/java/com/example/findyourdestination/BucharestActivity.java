package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class BucharestActivity extends AppCompatActivity {

  //  ImageButton myButton = (ImageButton) findViewById(R.id.imageButton4);

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bucharest);
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bucharest);
            ImageButton buttonArc = (ImageButton) findViewById(R.id.imageButton4);
            ImageButton buttonAteneu = (ImageButton) findViewById(R.id.imageButton);
            ImageButton buttonCismigiu = (ImageButton) findViewById(R.id.imageButton3);
            ImageButton buttonParlament = (ImageButton) findViewById(R.id.imageButton5);
            final Context context = this;
            ImageButton buttonBack = (ImageButton) findViewById(R.id.imageButton6);
            buttonBack.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(context, MainActivity.class);
                    startActivity(intent);
                }
            });
            buttonArc.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(context, ArcActivity.class);
                    startActivity(intent);
                }
            });
            buttonAteneu.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(context, ActivityAteneu.class);
                    startActivity(intent);
                }
            });

            buttonCismigiu.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(context, Cismigiu.class);
                    startActivity(intent);
                }
            });
            buttonParlament.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(context, Parlament.class);
                    startActivity(intent);
                }
            });

        }
    }
//}