package com.example.projetointegrador.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class MoviesDBResponse (
        val allMoviesDB: MutableList<InfosDBResponse>
    )

data class InfosDBResponse (val id: Int,
                            val vote_average : Number,
                            val title : String,
                            val backdrop_path : String?,
                            val poster_path : String?,
                            val overview : String,
                            val release_date : String,
                            val genre_ids : String)
