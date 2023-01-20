package com.example.findyourdestination;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void registerUser(UserEntity userEntity);
    @Query("SELECT * from users where username=(:username) and password=(:password)")
    UserEntity login(String username, String password);

    @Query("SELECT * FROM users where username= (:username) and email= (:email) ")
    UserEntity getUser( String username, String email);

    @Query("SELECT * FROM users where username= (:username) and email= (:email) ")
    List<UserEntity> getUsers(String username, String email);

}
