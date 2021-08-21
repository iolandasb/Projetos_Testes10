package com.example.projetointegrador.data.mapper

import com.example.projetointegrador.data.database.InfosDB
import com.example.projetointegrador.data.model.Infos
import com.google.gson.Gson

class MoviesMapper {

    fun mapMoviesFromDatabaseToEntity(infosDB : InfosDB) = Infos(
        id = infosDB.id,
        vote_average = convertRating(infosDB.vote_average.toDouble()).toDouble(),
        title = infosDB.title,
        backdrop_path = infosDB.backdrop_path!!,
        poster_path = infosDB.poster_path!!,
        overview = infosDB.overview,
        release_date = infosDB.release_date,
        genre_ids = listOf(),
        runtime = 0,
        favoriteCheck = true)

    fun mapMoviesFromEntityToDatabase(infos : Infos) = InfosDB(
        id = infos.id,
        vote_average = convertRating(infos.vote_average),
        title = infos.title,
        backdrop_path = infos.backdrop_path,
        poster_path = infos.poster_path,
        overview = infos.overview,
        release_date = infos.release_date,
        genre_ids = Gson().toJson(infos.genre_ids))

    fun convertRating(userRating: Number): String {
        return "${"%.0f".format((userRating.toDouble() * 10.0))}%"
    }
}