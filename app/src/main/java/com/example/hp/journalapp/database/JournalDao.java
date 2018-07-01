package com.example.hp.journalapp.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by hp on 6/29/2018.
 */
@Dao
public interface JournalDao {
    @Query("SELECT * FROM diary")
    LiveData<List<JournalEntry>> loadAllTasks();

    @Insert
    void insertTask(JournalEntry journalEntry);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateTask(JournalEntry journalEntry);

    @Delete
    void deleteTask(JournalEntry journalEntry);

    @Query("SELECT * FROM task WHERE id = :id")
    LiveData<JournalEntry> loadTaskById(int id);
}
