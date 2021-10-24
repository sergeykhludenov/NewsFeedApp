package com.example.newsfeedapp.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsModel(
    @SerializedName("status")
    val status: String,

    @SerializedName("totalResults")
    val totalResults: Int,

    @SerializedName("articles")
    val articles: List<ArticleModel>

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
