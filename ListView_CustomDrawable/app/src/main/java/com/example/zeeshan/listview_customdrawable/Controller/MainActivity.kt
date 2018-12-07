package com.example.zeeshan.listview_customdrawable.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.zeeshan.listview_customdrawable.Adapters.StudentAdapter
import com.example.zeeshan.listview_customdrawable.Model.Student
import com.example.zeeshan.listview_customdrawable.R
import com.example.zeeshan.listview_customdrawable.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        studentListView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, DataService.student)
        adapter = StudentAdapter(this, DataService.student)
        studentListView.adapter = adapter



    }
}
