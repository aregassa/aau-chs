package com.aau.chs.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.aau.chs.Models.School

@Dao
interface SchoolDao {
    @Query("SELECT * FROM school")
    fun getAllSchools(): LiveData<List<School>>

    @Query("SELECT School FROM school")
    fun getAllSchoolNames() : LiveData<List<String>>

    @Query("SELECT * FROM school WHERE School = :schoolName ")
    fun getSchoolInfo(schoolName: String) : LiveData<School>

}

