package com.example.newsfeedapp.features.main_screen.data.api

import com.example.newsfeedapp.features.main_screen.data.api.model.NewsModel

class NewsRemoteSource(val api: NewsApi) {
    suspend fun getNews() : NewsModel = api.getTopHeadlines()

}
