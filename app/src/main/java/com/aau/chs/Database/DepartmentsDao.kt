package com.aau.chs.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.aau.chs.Models.Department

@Dao
interface DepartmentsDao {
    @Query("SELECT Department FROM departments WHERE School = :school")
    fun getDepartmentsForSchool(school : String) : LiveData<List<String>>

    @Query("SELECT * FROM departments WHERE Department = :departmentName")
    fun getDepartmentInfo(departmentName: String) : LiveData<Department>
    // TODO add query to get department info from table
}