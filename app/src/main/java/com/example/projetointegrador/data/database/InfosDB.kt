package com.example.projetointegrador.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class MoviesDB(
  val allMoviesDB: MutableList<InfosDB>
)

@Entity(tableName = "favorite_movies")
data class InfosDB (@PrimaryKey(autoGenerate = false)
                    @ColumnInfo(name = "id")
                    val id: Int,
                    @ColumnInfo(name = "vote_average")
                    val vote_average : String,
                    @ColumnInfo(name = "title")
                    val title : String,
                    @ColumnInfo(name = "backdrop_path")
                    val backdrop_path : String?,
                    @ColumnInfo(name = "poster_path")
                    val poster_path : String?,
                    @ColumnInfo(name = "overview")
                    val overview : String,
                    @ColumnInfo(name = "release_date")
                    val release_date : String,
                    @ColumnInfo(name = "genre_ids")
                    val genre_ids : String)