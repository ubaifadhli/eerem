package com.guiteam.eerem

import android.app.Application
import androidx.room.Room
import com.guiteam.eerem.viewmodel.AppDatabase

class EeremApplication : Application() {
    companion object {
        var database: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        EeremApplication.database = Room.databaseBuilder(this, AppDatabase::class.java,
            "eerem-master-db").build()
    }
}