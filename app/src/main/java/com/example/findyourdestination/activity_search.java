package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class activity_search extends AppCompatActivity {

    SearchView searchView;
    ListView myListView;

    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchView =findViewById(R.id.searchView);
        myListView=findViewById(R.id.listView);

//        myListView.setVisibility(View.GONE);

        arrayList=new ArrayList<>();
        arrayList.add("Timisoara");
        arrayList.add("Targu-Jiu");
        arrayList.add("Bucuresti");
        arrayList.add("Cluj-Napoca");
//        arrayList.add("Sibiu");
//        arrayList.add("Brasov");
//        arrayList.add("Sighisoara");
//        arrayList.add("Constanta");
//        arrayList.add("Oradea");

        adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, arrayList);
        myListView.setAdapter(adapter);

//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                myListView.setVisibility(View.VISIBLE);
//                adapter.getFilter().filter(s);
//                return false;
//            }
//        });

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked apple

                    startActivity(new Intent(activity_search.this,TimisoaraActivity.class));

                }else if(position==1){
                    //clicked orange
                    startActivity(new Intent(activity_search.this,TgJiuActivity.class));
                }else if(position==2) {
                    //clicked orange
                    startActivity(new Intent(activity_search.this, BucharestActivity.class));
                } else{

                }
            }
        });

    }
}