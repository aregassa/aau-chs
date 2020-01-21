package com.aau.chs.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.aau.chs.Database.AppDatabase
import com.aau.chs.Database.SchoolRepository

class HomePageViewModel (application: Application) : AndroidViewModel(application) {
    private val repository : SchoolRepository
    val schools : LiveData<List<String>>

    init {
        val schoolDao = AppDatabase.getDatabase(application, viewModelScope).schoolDao()
        repository = SchoolRepository(schoolDao)
        schools = repository.schools
    }
}
