package com.sumeetb.kotlindemo.repository

import com.sumeetb.kotlindemo.ui.login.LoginInfo
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by sumeetb on 14/02/18.
 * Created api methods
 */
interface APIService {


    @POST("client_identifier")
    @FormUrlEncoded
    abstract fun getSaltKey(@Field("ssid") deviceId: String): Observable<String>
}