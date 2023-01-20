package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Login extends AppCompatActivity {
EditText username, password;
Button login;
public static UserDatabase myUserDatabase;
   public static UserDao userDao;
   // @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(android.R.id.content, new HomeFragment()).commit();
//        }
        setContentView(R.layout.activity_login);
        username= findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.loginl);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String usernameText = username.getText().toString();
               String passwordText = password.getText().toString();
               if(usernameText.isEmpty() || passwordText.isEmpty()){
                   Toast.makeText(getApplicationContext(), "Fill all fields!",Toast.LENGTH_SHORT).show();
               }
               else{
                   // database initialization : query
                   UserDatabase userDatabase = UserDatabase.getUserDatabase(getApplicationContext());
                    userDao = userDatabase.userDao();
                   new Thread(new Runnable() {
                       @Override
                       public void run() {
                          UserEntity userEntity =userDao.login(usernameText, passwordText);
                          if(userEntity == null){
                              runOnUiThread(new Runnable() {
                                  @Override
                                  public void run() {
                                      Toast.makeText(getApplicationContext(), "Invalid credentials", Toast.LENGTH_SHORT).show();

                                  }
                              });
                          }
                          else{
                              //going to explore page
                              //   String name = userEntity.getUsername();
                              Intent i = new Intent(
                                      Login.this, MainActivity.class);
                             startActivity(i);
                              finish();
                                     // .putExtra("name", name));


                          }
                       }
                   }).start();
               }

            }


        });



    }


}