package com.example.projetointegrador.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.projetointegrador.data.database.DatabaseBuilder
import com.example.projetointegrador.data.database.InfosDB
import com.example.projetointegrador.data.database.MoviesDao
import com.example.projetointegrador.data.model.Infos

class Favorites {

   @RequiresApi(Build.VERSION_CODES.N)

   val moviesBuilder = DatabaseBuilder()

   fun setList(movies: MutableList<Infos>) {
       favoritesList.addAll(movies)
   }

    fun addToFavorites(movie: Infos) {
        val position = favoritesList.indexOf(movie)
        if (position == -1) {
            favoritesList.add(movie)
            listFavoritesMovies()
        } else {
            favoritesList[position] = favoritesList[position].copy(favoriteCheck = true)
        }
    }

    fun removeFromFavorites(movie: Infos) {
        val index = favoritesList.indexOf(movie)
        favoritesList[index] = favoritesList[index].copy(favoriteCheck = false)
    }

    fun listFavoritesMovies(): MutableList<InfosDB> {
        return DatabaseBuilder.dataBase?.moviesDao()!!.getFavoritesMoviesDB()
    }

    private companion object {
        val favoritesList: MutableList<Infos> = mutableListOf()
    }


}