package com.zeeshan.kotlinretrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zeeshan.kotlinretrofit.retrofit.PostAPI
import com.zeeshan.kotlinretrofit.retrofit.RetrofitServices
import io.reactivex.disposables.CompositeDisposable
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    internal lateinit var jsonApi : PostAPI
    internal lateinit var conpositeDisposable: CompositeDisposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = RetrofitServices.instance
        jsonApi = retrofit.create(PostAPI,)


    }
}
