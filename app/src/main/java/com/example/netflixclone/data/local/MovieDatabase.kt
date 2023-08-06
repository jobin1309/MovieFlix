package com.example.netflixclone.data.local

import android.graphics.Movie
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.netflixclone.model.MoviesResult
import com.google.android.material.theme.overlay.MaterialThemeOverlay


@Database(entities = [MoviesResult::class], version = 1, exportSchema = false)
abstract class MovieDatabase: RoomDatabase() {

    abstract fun MovieDao(): MovieDao

}