package com.example.corona_howmany.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.util.concurrent.TimeUnit

object CoronaClient {
    var retrofitService: CoronaDao

    init {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val logger = OkHttpClient.Builder().addInterceptor(interceptor)
            .readTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS).build()

        val retrofit = Retrofit.Builder()
            .baseUrl("http://openapi.data.go.kr/openapi/service/rest/Covid19/")
            .addConverterFactory(SimpleXmlConverterFactory.createNonStrict())
            .client(logger)
            .build()

        retrofitService = retrofit.create(CoronaDao::class.java)
    }
}