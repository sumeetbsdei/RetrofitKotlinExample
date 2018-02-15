package com.sumeetb.kotlindemo.ui.login;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by parmil.sharma.
 */
public class LoginInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("access_token")
    public String aceessToken;

    @SerializedName("expires_in")
    public String expireIn;

    @SerializedName("token_type")
    public String tokenType;

    @SerializedName("scope")
    public String scope;

    @SerializedName("refresh_token")
    public String refreshToken;

    @SerializedName("user_id")
    public String userId;

    @SerializedName("isTermsAccepted")
    public boolean isTermsAccepted;
}
