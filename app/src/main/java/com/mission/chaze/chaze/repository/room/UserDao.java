package com.mission.chaze.chaze.repository.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.mission.chaze.chaze.models.UserProfile;

@Dao
public interface UserDao {
//userProfile queries
    @Insert
    void InsertUserLoginData(UserProfile ...userLoginData);
    @Query("SELECT * FROM user_profile")
    UserProfile getUserProfile();

}
