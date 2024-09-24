package com.example.yourname.job1nsda

import retrofit2.http.GET

interface ApiService {

    @GET("products")
    suspend fun getProducts():List<Product>

}