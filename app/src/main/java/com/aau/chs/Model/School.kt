package com.aau.chs.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "school")
class School (
    @PrimaryKey @ColumnInfo(name = "School") var schoolName: String,
    @ColumnInfo(name = "Description") var description: String)