package com.example.retrofitget

import retrofit2.Call
import retrofit2.http.GET


interface MyInterface {
    @GET("posts")
    fun getMyData(): Call<MyData>
}