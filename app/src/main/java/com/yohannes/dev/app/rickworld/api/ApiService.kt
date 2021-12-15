package com.yohannes.dev.app.rickworld.api

import com.yohannes.dev.app.rickworld.models.ResponseApi
import com.yohannes.dev.app.rickworld.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ): Response<ResponseApi>
}