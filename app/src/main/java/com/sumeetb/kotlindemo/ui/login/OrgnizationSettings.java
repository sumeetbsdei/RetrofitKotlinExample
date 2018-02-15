package com.sumeetb.kotlindemo.ui.login;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by parmil.sharma on 18/01/18.
 */

public class OrgnizationSettings {
    @SerializedName("success")
    public ArrayList<Organiation> organisationDetails = new ArrayList<>();

    public static  class Organiation  {
        @SerializedName("id")
        public String _id;

        @SerializedName("dialer_access")
        public String dialer_access;

        @SerializedName("ccm_enabled")
        public String ccm_enabled;
    }
}
