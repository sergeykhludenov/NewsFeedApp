package com.example.newsfeedapp.features.main_screen.data.api


interface NewsRepo {
    suspend fun getNews(): List<ArticleDomainModel>
}
