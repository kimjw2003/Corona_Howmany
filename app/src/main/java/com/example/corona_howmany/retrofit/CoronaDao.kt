package com.example.corona_howmany.retrofit

import com.example.corona_howmany.data.Base
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CoronaDao {
@GET("getCovid19SidoInfStateJson")
    fun getCorona(
        @Query("serviceKey", encoded = true) serviceKey: String,
        @Query("numOfRows", encoded = true) numOfRows: String,
        @Query("pageNo", encoded = true) pageNo : String,
        @Query("startCreate_dt", encoded = true) startCreate_dt : String,
        @Query("endCreateDt", encoded = true) endCreateDt : String
    ) : Call<Base>
}