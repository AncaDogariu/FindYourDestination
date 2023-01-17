package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class OperaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opera);
        setupHyperlink();
        ImageButton button = (ImageButton) findViewById(R.id.imageButton6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(OperaActivity.this,TimisoaraActivity.class));

            }
        });
    }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.textView8);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}