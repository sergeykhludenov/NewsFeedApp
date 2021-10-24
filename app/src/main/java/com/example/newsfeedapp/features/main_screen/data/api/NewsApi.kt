package com.example.newsfeedapp.features.main_screen.data.api

import com.example.newsfeedapp.features.main_screen.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

// https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String = "ru",
        @Query("apiKey") apiKey: String = "ec09a054ef0b4f179a37dc790329bf2a"
    ) : NewsModel
}