package com.example.booksrecomended.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseBody (
    @Json(name = "results")
    val bookResponse : List<ResultsResponse>
)