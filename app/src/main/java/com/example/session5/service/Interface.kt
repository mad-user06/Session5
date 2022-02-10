package com.example.session5.service

import com.example.session5.model.GetToken
import com.example.session5.model.LogIn
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Interface {
    @POST("auth/login")
    suspend fun getLogin(@Body logIn: LogIn) : Response<GetToken>

}