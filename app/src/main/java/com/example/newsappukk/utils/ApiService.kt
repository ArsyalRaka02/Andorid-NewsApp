package com.example.newsappukk.utils

import com.example.newsappukk.POJO.*
import com.example.newsappukk.model.RegisterResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


/**
 * Created by Arsyal Raka on 10/04/20, 2020,
 * Saigusa231@gmail.com,
 * ScCreativeIndo
 */
interface ApiService {

    @FormUrlEncoded
    @POST("user/login")
    fun osisLogin(
        @Field("username") username:String,
        @Field("password") password:String
    )

    @FormUrlEncoded
    @POST("user/register")
    fun createUser(
        @Field("username") username: String,
        @Field("password") password: String
    ): Call<RegisterResponse>

    @GET("berita")
    fun getData() : Call<pojoBerita>

    @GET("berita/{id}")
    fun getBeritaId() : Call<pojoIdBerita>

    @GET("berita/show/{id}")
    fun getKategoriBerita() : Call<pojoKategoriBerita>

    @GET("kategori")
    fun getKategori() : Call<pojoKategori>

    @GET("kategori/{id}")
    fun getIdKategori() : Call<pojoIdKategori>

}