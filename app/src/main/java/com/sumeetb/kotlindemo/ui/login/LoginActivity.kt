package com.sumeetb.kotlindemo.ui.login

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.provider.Settings
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.sumeetb.kotlindemo.repository.ApiUtilis
import com.sumeetb.kotlindemo.repository.ErrorModel
import com.sumeetb.kotlindemo.repository.NetworkManager
import com.sumeetb.kotlindemo.repository.ServiceListener
import com.sumeetb.kotlindemo.R

/**
 * Created by parmil.sharma on 13/02/18.
 */
class LoginActivity : AppCompatActivity(),LifecycleOwner{

    private val registry = LifecycleRegistry(this)

    override fun getLifecycle(): LifecycleRegistry = registry
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
         //{"success":"BYGfrLtWzOacyboZoipXmPQo+cMHWb1r"}

        // api hit using retrofit

//        val manager = NetworkManager(this@LoginActivity)
//        manager.showProgress(false)
//        val androidId = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID)
//
//        manager.createApiRequest(ApiUtilis.getAPIService().getSaltKey(androidId), object : ServiceListener<String>{
//            override fun getServerResponse(response: String, requestcode: Int) {
//
//
//                Toast.makeText(this@LoginActivity, "Succeszss", Toast.LENGTH_LONG).show()
//            }
//
//            override fun getError(error: ErrorModel, requestcode: Int) {
//                Toast.makeText(this@LoginActivity,"ERROR",Toast.LENGTH_LONG).show()
//            }
//        })
    }

}