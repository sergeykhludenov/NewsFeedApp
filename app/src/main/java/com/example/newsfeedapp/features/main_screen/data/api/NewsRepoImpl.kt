package com.example.newsfeedapp.features.main_screen.data.api

import com.example.newsfeedapp.features.main_screen.data.toDomain
import com.example.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

class NewsRepoImpl(private val source: NewsRemoteSource) : NewsRepo {
    override suspend fun getNews(): List<ArticleDomainModel> {
        return source.getNews().articles.map {
            it.toDomain()
        }
    }
}