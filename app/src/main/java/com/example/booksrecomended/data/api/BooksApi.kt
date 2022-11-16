package com.example.booksrecomended.data.api

import retrofit2.Call
import retrofit2.http.GET

interface BooksApi {

    @GET("list.json")
    fun listRepos(): Call<List<>>?
}