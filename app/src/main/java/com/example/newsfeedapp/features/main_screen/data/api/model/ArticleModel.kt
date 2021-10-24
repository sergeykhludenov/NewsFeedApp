package com.example.newsfeedapp.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

class ArticleModel(
    @SerializedName("source")
    val source: String,

    @SerializedName("author")
    val author: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("urlToImage")
    val urlToImage: String,

    @SerializedName("publishedAt")
    val publishedAt: String,

    @SerializedName("content")
    val content: String,
)

/*
"status": "ok",
"totalResults": 38,
-"articles": [
-{
    -"source": {
        "id": null,
        "name": "YouTube"
    },
    "author": null,
    "title": "Google's Pixel 6 event: Watch with us LIVE - Engadget",
    "description": "Google's Pixel 6 event: Watch with us LIVELive closed captioning URL: https://www.streamtext.net/player?event=EngadgetLiveEventsRead our full story on Engadg...",
    "url": "https://www.youtube.com/watch?v=-IcOUB2poZA",
    "urlToImage": "https://i.ytimg.com/vi/-IcOUB2poZA/hqdefault_live.jpg",
    "publishedAt": "2021-10-19T16:35:49Z",
    "content": null*/