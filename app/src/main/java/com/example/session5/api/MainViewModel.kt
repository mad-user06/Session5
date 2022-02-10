package com.example.session5.api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.session5.model.GetToken
import com.example.session5.model.LogIn
import com.example.session5.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.http.Body

class MainViewModel(private val repository: Repository):ViewModel() {
    val myResponse : MutableLiveData<Response<GetToken>> = MutableLiveData()

    fun getLogin(@Body logIn: LogIn){
        viewModelScope.launch {
            val response = repository.getLogin(logIn)
            myResponse.value = response
        }
    }
}