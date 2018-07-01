package com.example.hp.journalapp.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by hp on 6/29/2018.
 */
@Entity (tableName = "diary")
public class JournalEntry {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String journalContent;
    @ColumnInfo(name = "journalDate")
    private Date journalDate;

    @Ignore
    public JournalEntry(String description, Date updatedAt) {
        this.journalContent = journalContent;
        this.journalDate = journalDate;
    }

    public JournalEntry(int id, String journalContent , Date journalDate) {
        this.id = id;
        this.journalContent = journalContent;
        this.journalDate = journalDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJournalContent() {
        return journalContent;
    }

    public void setJournalContent(String journalContent) {
        this.journalContent = journalContent;
    }

    public Date getJournalDate() {
        return journalDate;
    }

    public void setJournalDate(Date journalDate) {
        this.journalDate = journalDate;
    }

}
