package com.eddie.retrofitapp.api

import com.eddie.retrofitapp.models.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {
    @GET("users")
   suspend fun getUsers(): List<User>
}