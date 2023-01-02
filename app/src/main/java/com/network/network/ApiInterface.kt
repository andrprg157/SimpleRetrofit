package com.network.network

import com.network.model.Quotes

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/quotes")
    suspend fun getQuotes() : Response<Quotes>
}