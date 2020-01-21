package com.aau.chs.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "departments")
class Department (
    @PrimaryKey @ColumnInfo(name = "Department") var departmentName: String,
    @ColumnInfo(name = "School") var schoolOfDepartment: Department,
    @ColumnInfo(name = "Description") var departmentInfo: String?){
}