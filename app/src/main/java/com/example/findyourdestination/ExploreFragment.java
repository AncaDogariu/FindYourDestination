package com.example.findyourdestination;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class ExploreFragment extends Fragment {
    ImageButton buttonCatedrala;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_explore, container, false);


        ImageButton buttonCatedrala = (ImageButton) view.findViewById(R.id.imageButton);
        ImageButton buttonOpera = (ImageButton) view.findViewById(R.id.imageButton4);
        ImageButton buttonUnirii = (ImageButton) view.findViewById(R.id.imageButton3);
        ImageButton buttonMuzeu = (ImageButton) view.findViewById(R.id.imageButton5);
        final ExploreFragment context = this;
        ImageButton buttonBack = (ImageButton) view.findViewById(R.id.imageButton6);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        buttonCatedrala.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), CatedralaActivity.class);
                startActivity(intent);
            }
        });
        buttonOpera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), OperaActivity.class);
                startActivity(intent);
            }
        });
        buttonUnirii.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), UniriiActivity.class);
                startActivity(intent);
            }
        });
        buttonMuzeu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), MuzeuActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }


}
