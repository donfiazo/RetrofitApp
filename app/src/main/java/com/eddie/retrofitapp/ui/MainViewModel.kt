package com.eddie.retrofitapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eddie.retrofitapp.api.RetrofitProvider
import com.eddie.retrofitapp.models.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel :ViewModel() {

    val usersLiveData = MutableLiveData<List<User>>()

    fun getUsers(){
        CoroutineScope(Dispatchers.IO).launch {
            usersLiveData.postValue(RetrofitProvider.placeHolderAPI.getUsers())
        }
    }
}

