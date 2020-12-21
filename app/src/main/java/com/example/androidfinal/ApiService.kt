package com.example.androidfinal

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
@GET("news/")
fun getNews(): Call<List<Post>>
}