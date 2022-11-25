package com.example.booksrecomended.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResultsResponse(
    @Json(name = "book_details")
    val bookDetails : List<DetailsResponse>
)