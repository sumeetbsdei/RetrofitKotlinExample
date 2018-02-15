package com.sumeetb.kotlindemo.repository

/**
 * Created by sumeetb on 14/02/18.
 * response codes returned from api
 */
class ResponseCodes {

    companion object {


    /** System Level Response Codes Starts Here **/

    /** The Constant Success.  */
    val Success = 200

    /** The Constant Success.  */
    val Accepted = 201

    /** The Constant AccessToken expired.  */
    val ACCESS_TOKEN_EXPIRED = 401

    /** The Constant RefreshToken expired.  */
    val REFRESH_TOKEN_EXPIRED = 400

    /** The Constant InvalidUseridPassword  */
    val BAD_REQUEST = 400


    // Error Codes
    val REQUEST_CANCEL = -1
    val RESPONSE_JSON_NOT_VALID = 1
    val MODEL_TYPE_CAST_EXCEPTION = 2
    val INTERNET_NOT_AVAILABLE = 3
    val WRONG_URL = 4
    val WRONG_METHOD_NAME = 5
    val URL_CONNECTION_ERROR = 6
    val UNKNOWN_ERROR = 10

    val NOT_ALLOWED = 403


    fun logErrorMessage(code: Int): String {
        var errorMessage = ""

        when (code) {

            REQUEST_CANCEL -> errorMessage = "Request Canceled"

            INTERNET_NOT_AVAILABLE -> errorMessage = "Internet connection is not available. Please check it and try again"

            WRONG_URL -> errorMessage = "You are trying to hit wrong url, Please check it and try again"

            WRONG_METHOD_NAME -> errorMessage = "You are passing wrong method name. i.e POST, GET, DELETE etc"

            URL_CONNECTION_ERROR -> errorMessage = "Connection is not established, Please try again"


            RESPONSE_JSON_NOT_VALID ->

                errorMessage = "Json you are getting is not valid"

            MODEL_TYPE_CAST_EXCEPTION -> errorMessage = "Server is not working. Please try after some time."

            NOT_ALLOWED -> errorMessage = "Server is not working. Please try after some time."

            else -> errorMessage = "Unknown error"
        }
        return errorMessage
    }
    }
}