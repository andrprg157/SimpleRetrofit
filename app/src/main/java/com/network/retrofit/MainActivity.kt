package com.network.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.network.network.ApiInterface
import com.network.network.Apiclient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val TAG = "shiv"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = Apiclient.getInstance().create(ApiInterface::class.java)
        GlobalScope.launch {
            val result = apiInterface.getQuotes();
            if (result != null) {
                Log.d(TAG, "onCreate: RESULT = ${result.body().toString()}")
            }
        }
    }
}