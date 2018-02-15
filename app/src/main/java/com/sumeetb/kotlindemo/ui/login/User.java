package com.sumeetb.kotlindemo.ui.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by parmil
 */

public class User {
    public success success;

    public class success {
        @SerializedName("org_id")
        public String orgId;

        @SerializedName("user_type_id")
        public String userTypeId;

        @SerializedName("first_name")
        public String firstName;

        @SerializedName("last_name")
        public String lastName;

        @SerializedName("image")
        public String image;

        @SerializedName("email")
        public String email;

        @SerializedName("org_name")
        public String orgName;

        @SerializedName("org_city")
        public String orgCity;

        @SerializedName("org_latitude")
        public String orgLatitude;

        @SerializedName("org_longitude")
        public String orgLongitude;

        @SerializedName("phone_number")
        public String phoneNumber;

        @SerializedName("department")
        public String department;

        @SerializedName("dialer_access")
        public String dialerAccess;

        @SerializedName("messaging_critical_enabled")
        public String messagingCriticalEnabled;

        @SerializedName("messaging_patient_info_enabled")
        public String messagingPatientInfoEnabled;

        @SerializedName("messaging_consult_requests_enabled")
        public String messagingConsultRequestsEnabled;

        @SerializedName("messaging_discharges_enabled")
        public String messagingDischargesEnabled;

        @SerializedName("physician")
        public physician physician;

        @SerializedName("chat_status")
        public String chatStatus;

        public OrgnizationSettings.Organiation organiation;
    }
}


