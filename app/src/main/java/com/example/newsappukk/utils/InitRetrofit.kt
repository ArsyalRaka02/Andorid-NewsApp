package com.example.newsappukk.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Arsyal Raka on 10/04/20, 2020,
 * Saigusa231@gmail.com,
 * ScCreativeIndo
 */
class InitRetrofit {

    fun getInitRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(EndPoints.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getInitInstance(): ApiService {
        return getInitRetrofit().create(ApiService::class.java)
    }

}