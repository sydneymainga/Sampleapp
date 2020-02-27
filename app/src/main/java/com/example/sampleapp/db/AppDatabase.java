package com.example.sampleapp.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {PersonInfo.class}, version = 1)


public abstract class AppDatabase extends RoomDatabase {

    //private static AppDatabase INSTANCE;

    public abstract PersonInfoDao personInfoDao();






}

