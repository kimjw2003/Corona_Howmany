package com.example.corona_howmany

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.corona_howmany.data.Base
import com.example.corona_howmany.retrofit.CoronaClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getCorona()
    }

    private fun getCorona(){
        CoronaClient.retrofitService.getCorona(
            "BVGRPZAsOY6qzmiUtScnKkBraRMnIOJ%2F26fTMonMRLgwniHt5fwhWHMSWxV9k5eVQdY00vxTVc2jNdpWLxrEbQ%3D%3D",
            "10", "1", "20201022", "20201022"
        ).enqueue(object : retrofit2.Callback<Base> {
            override fun onResponse(call: Call<Base>, response: Response<Base>) {

            }

            override fun onFailure(call: Call<Base>, t: Throwable) {

            }

        })
    }
}

