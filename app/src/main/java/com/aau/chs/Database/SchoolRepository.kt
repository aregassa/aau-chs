package com.aau.chs.Database

import androidx.lifecycle.LiveData
import com.aau.chs.Models.School

class SchoolRepository(private val schoolDao: SchoolDao) {
    val schoolsAndDescriptions: LiveData<List<School>> = schoolDao.getAllSchools()
    val schools: LiveData<List<String>> = schoolDao.getAllSchoolNames()
}