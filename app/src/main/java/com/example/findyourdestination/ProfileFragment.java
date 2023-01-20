package com.example.findyourdestination;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class ProfileFragment extends Fragment {
    ImageButton logOutButton;
    private TextView userinfo;
    private UserEntity user;
    private UserDao userDao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_profile, container, false);
        logOutButton = (ImageButton)  view.findViewById(R.id.logout_btn);
        userinfo =  view.findViewById(R.id.username);
  //      userinfo.setText(Login.name);
      // List<UserEntity> users = (List<UserEntity>) Login.userDao.login().getUsers();
  //      user = (UserEntity) getActivity().getIntent().getSerializableExtra("User");
//        userDao = Room.databaseBuilder(getContext(), UserDatabase.class, "am_users.db").allowMainThreadQueries().build().userDao();
     //   List<UserEntity> users = Login.userDatabase.userDao().getUsers();userinfo=
        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), welcomescreen.class);
                startActivity(intent);
            }
        });

        return view;
    }
    }
