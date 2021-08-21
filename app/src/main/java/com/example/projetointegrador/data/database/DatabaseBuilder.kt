package com.example.projetointegrador.data.database

import android.app.Application
import androidx.room.Room

class DatabaseBuilder : Application() {

    companion object {
        var dataBase: Database? = null
    }

    override fun onCreate() {
        super.onCreate()
        dataBase =  Room.databaseBuilder(applicationContext, Database::class.java, "movie_db").fallbackToDestructiveMigration().build()
    }

}