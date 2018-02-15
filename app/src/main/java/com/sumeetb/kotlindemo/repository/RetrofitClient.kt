package com.sumeetb.kotlindemo.repository

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import okhttp3.logging.HttpLoggingInterceptor



/**
 * Created by sumeetb on 14/02/18.
 * Retrofit client is created in this class. Okhttp is used for logging purpose
 */
class RetrofitClient {

    companion object {
         lateinit var retrofit: Retrofit



    fun getClient(baseUrl: String): Retrofit{

            val gson = GsonBuilder().setLenient().create()
            retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    //.addConverterFactory(GsonConverterFactory.create())
                    .client(okClient())
                    .build()


        return retrofit
    }


    private fun okClient(): OkHttpClient {

        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.connectTimeout(1, TimeUnit.MINUTES)
        httpClient.readTimeout(1, TimeUnit.MINUTES)
        httpClient.addInterceptor(loggingInterceptor)


        return httpClient.build()
    }

    }
}