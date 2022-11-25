package com.example.booksrecomended.data.api

import com.example.booksrecomended.data.response.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApi {

    @GET("list.json")
    fun listRepos(
        @Query("api-key")apiKey: String = "rPB9mjmZ22iRT1LetWhrG1PmYTntaPs4",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<ResponseBody>
}