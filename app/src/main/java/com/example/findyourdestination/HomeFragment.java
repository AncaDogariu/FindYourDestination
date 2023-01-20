package com.example.findyourdestination;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    SearchView searchView;
    ListView myListView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_home, container, false);





        //     setContentView(R.layout.fragment_home);

        searchView =view.findViewById(R.id.searchView);
        myListView=view.findViewById(R.id.listView);

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

        adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1 , arrayList);
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

                    startActivity(new Intent(getActivity(), TimisoaraActivity.class));

                }else if(position==1){
                    //clicked orange
                    startActivity(new Intent(getActivity(),TgJiuActivity.class));
                }else if(position==2) {
                    //clicked orange
                    startActivity(new Intent(getActivity(), BucharestActivity.class));
                } else{

                }
            }
        });
        return view;

    }

}