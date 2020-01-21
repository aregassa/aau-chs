package com.aau.chs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aau.chs.ui.main.HomePageFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setSupportActionBar(findViewById(R.id.app_toolbar))
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomePageFragment.newInstance())
                .commitNow()
        }
    }

}
