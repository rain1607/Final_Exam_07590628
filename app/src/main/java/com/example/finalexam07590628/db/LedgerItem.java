package com.example.finalexam07590628.db;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
@Entity(tableName = "ledger")
public class LedgerItem {

    @PrimaryKey(autoGenerate = true)
    @SerializedName("fullname")
    public String fullname;

    @ColumnInfo(name = "username")
    @SerializedName("username")
    public String username;

    @ColumnInfo(name = "password")
    @SerializedName("password")
    public String password;

    public LedgerItem(String fullname, String username, String password) {
        this.fullname=fullname;
        this.username = username;
        this.password=password;
    }
}
