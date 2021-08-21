package com.example.projetointegrador.data.repository

import com.example.projetointegrador.data.database.DatabaseBuilder
import com.example.projetointegrador.data.mapper.MoviesMapper
import com.example.projetointegrador.data.model.Infos

class MoviesDBRepository(private val moviesMapper: MoviesMapper = MoviesMapper()) {

    suspend fun getFavoritesMoviesDB() : List<Infos>? {
        return DatabaseBuilder.dataBase?.moviesDao()?.getFavoritesMoviesDB()?.map { moviesMapper.mapMoviesFromDatabaseToEntity(it) }
    }

    /*suspend fun getFavoriteMovieFromId(movieID: Int) : MovieDetail? {

        val movieDB = DatabaseBuilder.dataBase?.moviesDao()?.getFavoriteMovieFromId(movieID)

        return if (movieDB.isNullOrEmpty()) {
            null
        } else {
            moviesDetailMapper.mapMoviesFromDatabaseToEntity(movieDB[0])
        }
    }*/

    suspend fun addFavoriteMoviesDB(movie: Infos) : Infos {
        DatabaseBuilder.dataBase?.moviesDao()?.addFavoriteMoviesDB(moviesMapper.mapMoviesFromEntityToDatabase(movie))
        return movie
    }

    suspend fun deleteFavoriteMoviesDB(movie: Infos) : Infos {
        DatabaseBuilder.dataBase?.moviesDao()?.deleteFavoriteMoviesDB(moviesMapper.mapMoviesFromEntityToDatabase(movie))
        return movie
    }
}