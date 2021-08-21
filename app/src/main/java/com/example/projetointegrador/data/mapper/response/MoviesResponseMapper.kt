package com.example.projetointegrador.data.mapper.response

import com.example.projetointegrador.data.model.Infos
import com.example.projetointegrador.data.model.InfosDBResponse
import com.example.projetointegrador.data.model.ListMovies
import com.example.projetointegrador.data.model.MoviesDBResponse

class MoviesResponseMapper {

    fun mapPopularMovies(moviesResponse : MoviesDBResponse) = ListMovies(
        results = moviesResponse.allMoviesDB.map {mapMovies(it)}.toMutableList()
    )

    fun mapMovies(infosResponse : InfosDBResponse) = Infos (
        id = infosResponse.id,
        vote_average = infosResponse.vote_average,
        title = infosResponse.title,
        backdrop_path = infosResponse.backdrop_path!!,
        poster_path = infosResponse.poster_path!!,
        overview = infosResponse.overview,
        release_date = infosResponse.release_date,
        genre_ids = listOf(),
        runtime = 0)
}