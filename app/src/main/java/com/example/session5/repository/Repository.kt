package com.example.session5.repository

import com.example.session5.model.GetToken
import com.example.session5.model.LogIn
import com.example.session5.service.Instance
import retrofit2.Response
import retrofit2.http.Body

class Repository {
    suspend fun getLogin(@Body logIn: LogIn): Response<GetToken> {
        return Instance.apiServ.getLogin(logIn)
    }
}