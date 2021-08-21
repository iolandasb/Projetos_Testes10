package com.example.projetointegrador.data.database

import androidx.room.*
import com.example.projetointegrador.data.database.InfosDB
import com.example.projetointegrador.data.model.Infos

@Dao
interface MoviesDao {

    @Query("SELECT * FROM favorite_movies ORDER BY title")
    fun getFavoritesMoviesDB(): MutableList<InfosDB>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addFavoriteMoviesDB(movie: InfosDB)

    @Delete
    fun deleteFavoriteMoviesDB(movie: InfosDB)

}