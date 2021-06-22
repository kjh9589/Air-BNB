package com.teamnoyes.airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/78a9c6aa-24be-49c2-a63f-f29a69a6fc9e")
    fun getHouseList(): Call<HouseDto>
}