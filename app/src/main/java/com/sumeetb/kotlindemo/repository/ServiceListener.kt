package com.sumeetb.kotlindemo.repository

/**
 * Created by sumeetb on 14/02/18.
 * Interface to callback the response received
 */
interface ServiceListener<T> {

    abstract fun getServerResponse(response: T, requestcode: Int)
    abstract fun getError(error: ErrorModel, requestcode: Int)
}