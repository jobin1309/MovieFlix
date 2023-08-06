package com.example.netflixclone.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.netflixclone.data.local.MovieDao
import com.example.netflixclone.data.local.MovieDatabase
import com.example.netflixclone.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides //3rd party library
    fun providesDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, MovieDatabase::class.java, "movie_database"
    ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideMovieDao(movieDatabase: MovieDatabase): MovieDao {
        return movieDatabase.MovieDao()
    }
}

