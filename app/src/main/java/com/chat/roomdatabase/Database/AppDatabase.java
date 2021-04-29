package com.chat.roomdatabase.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.chat.roomdatabase.Entity.Task;
import com.chat.roomdatabase.Dao.TaskDao;

@Database(entities = {Task.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();



}