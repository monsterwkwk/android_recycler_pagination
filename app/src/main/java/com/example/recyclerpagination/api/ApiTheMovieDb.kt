package com.example.recyclerpagination.api

import com.example.recyclerpagination.BuildConfig
import com.example.recyclerpagination.model.TheMovieDb
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiTheMovieDb {
    @GET("movie/now_playing")
    fun getNowPlaying(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = BuildConfig.LANGUAGE,
        @Query("page") page: Int
    ): Observable<TheMovieDb>
}