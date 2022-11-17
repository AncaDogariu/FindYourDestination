package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText username, password;
Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username= findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);

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
                   UserDao userDao = userDatabase.userDao();
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
                              // going to home page
                           //   String name = userEntity.getUsername();
                              startActivity(new Intent(
                                      Login.this, HomeScreen.class));
                                     // .putExtra("name", name));


                          }
                       }
                   }).start();
               }

            }
        });

    }
}