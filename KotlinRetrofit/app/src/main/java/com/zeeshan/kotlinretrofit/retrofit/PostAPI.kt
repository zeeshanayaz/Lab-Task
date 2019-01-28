package com.zeeshan.kotlinretrofit.retrofit

import com.zeeshan.kotlinretrofit.models.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostAPI {
    @get: GET("posts")
    val posts : Observable<List<Post>>
}