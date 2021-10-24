package com.example.newsfeedapp.features.main_screen.domain

import com.example.newsfeedapp.features.main_screen.data.api.NewsRepo
import com.example.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

class NewsInteractor(private val repository: NewsRepo) {
    suspend fun getNews(): List<ArticleDomainModel> {
        return repository.getNews()
    }
}