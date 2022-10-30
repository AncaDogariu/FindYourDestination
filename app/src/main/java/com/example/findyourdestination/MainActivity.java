package com.example.findyourdestination;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 /*   //Initialize variable
    EditText editText;
    Button btAdd, btReset;
    RecyclerView recyleView;*/
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    ExploreFragment exploreFragment = new ExploreFragment();
    ProfileFragment profileFragment = new ProfileFragment();

   /* List<MainData> datalist = new ArrayList<>();
    LinearLayoutManager linearLayoutManager;
    RoomDB database;
    MainAdapter adapter;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment);
                        return true;

                    case R.id.explore:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, exploreFragment);
                        return true;

                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment);
                        return true;
                }
                return false;
            }
        });

    }




  /*   *//*   //Assigne variables
        editText = findViewById(R.id.edit_text);
        btAdd = findViewById(R.id.bt_add);
        btReset = findViewById(R.id.bt_reset);
        recyleView = findViewById(R.id.recycler_view);*//*

        //Initialize database
        database = RoomDB.getInstance(this);
        //Store database value in data list
        datalist = database.mainDao().getAll();

        //Initialize linear layout manager
        linearLayoutManager = new LinearLayoutManager(this);
        //Set layout manager
        recyleView.setLayoutManager(linearLayoutManager);
        //Initialize adapter
        adapter = new MainAdapter(MainActivity.this, datalist);
        //Set adapter
        recyleView.setAdapter(adapter);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get string from edit text
                String sText = editText.getText().toString().trim();
                //Check condition
                if(!sText.equals("")){
                    //When text is not empty
                    //Initialize main data
                    MainData data = new MainData();
                    //Set text on main data
                    data.setText(sText);
                    //Insert text in database
                    database.mainDao().insert(data);
                    //Clear edit text
                    editText.setText("");
                    //Notify when data is inserted
                    datalist.clear();
                    datalist.addAll(database.mainDao().getAll());
                    adapter.notifyDataSetChanged();

                }
            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Delete all data from database
                database.mainDao().reset(datalist);
                //Notify when all data deleted
                datalist.clear();
                datalist.addAll(database.mainDao().getAll());
                adapter.notifyDataSetChanged();

            }
        });
*/
    }
//}