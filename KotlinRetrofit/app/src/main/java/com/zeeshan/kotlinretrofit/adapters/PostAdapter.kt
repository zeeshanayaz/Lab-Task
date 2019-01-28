package com.zeeshan.kotlinretrofit.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.zeeshan.kotlinretrofit.R
import com.zeeshan.kotlinretrofit.R.id.parent
import com.zeeshan.kotlinretrofit.models.Post

class PostAdapter (var context : Context, var postList: List<Post>):RecyclerView.Adapter<PostViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PostViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.post_layout,null)
        return PostViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.txt_author.text = postList[position].userId.toString()
        holder.txt_title.text = postList[position].title.toString()
        holder.txt_content.text = StringBuilder(postList[position].body.substring(0,20)).append("...").toString()
    }

}