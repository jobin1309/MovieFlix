package com.example.netflixclone.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.netflixclone.model.MoviesResult
import java.util.concurrent.Flow

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie_table")
    fun getAll(): LiveData<List<MoviesResult>>

    @Insert(onConflict =OnConflictStrategy.REPLACE)
    suspend fun insertMovie(moviesResult: MoviesResult)
}