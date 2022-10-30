 package com.example.findyourdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class SignUpActivity extends AppCompatActivity {

    EditText username, password, email;
    Button signup;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        signup=findViewById(R.id.signup);
        login=findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //creating user entity
                UserEntity userEntity = new UserEntity();
                userEntity.setUsername(username.getText().toString());
                userEntity.setEmail(email.getText().toString());
                userEntity.setPassword(password.getText().toString());
                if(validateInput(userEntity)){
               // Do insert operation
                    UserDatabase userDatabase =UserDatabase.getUserDatabase(getApplicationContext());
                    UserDao userDao= userDatabase.userDao();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            userDao.registerUser(userEntity);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "User Registered!", Toast.LENGTH_SHORT).show();

                                }
                            });

                        }
                    }).start();

                } else
                {
                    Toast.makeText(getApplicationContext(),"Fill all fields!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this,Login.class));

            }
        });
    }
    private Boolean validateInput(UserEntity userEntity){
        if(userEntity.getUsername().isEmpty() ||
                userEntity.getEmail().isEmpty() ||
                userEntity.getPassword().isEmpty()){
            return false;
        }
            return true;
    }
}