package com.sumeetb.kotlindemo.repository


/**
 * Created by sumeetb on 14/02/18.
 * Create Retrofit client
 */
class ApiUtilis {


    companion object {

        val BASE_URL = "YOUR API base url"
        val WEB_SERVICE_URL = BASE_URL + " function name"

    fun getAPIService(): APIService {
        return RetrofitClient.getClient(WEB_SERVICE_URL).create(APIService::class.java)
    }
    }
}