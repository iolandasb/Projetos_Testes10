package com.example.projetointegrador.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.projetointegrador.data.model.Infos
import kotlinx.android.parcel.Parcelize

@Database(entities = [InfosDB::class], version = 2)
abstract class Database : RoomDatabase() {
    abstract fun moviesDao() : MoviesDao
}