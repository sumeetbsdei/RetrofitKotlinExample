package com.sumeetb.kotlindemo.ui.login;

import com.google.gson.annotations.SerializedName;

public class physician {
    @SerializedName("id")
    public String id;

    @SerializedName("speciality")
    public String speciality;

    @SerializedName("npi_no")
    public String npi_no;

    @SerializedName("license_number")
    public String licenseNumber;

    @SerializedName("license_state")
    public String licenseState;

    @SerializedName("speciality_name")
    public String specialityName;

    @SerializedName("credentials")
    public String credentials;


}