package com.example.zeeshan.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById<ListView>(R.id.ListView)

        val myArray = arrayOf("Zeeshan", "Ahsan", "Haseeb","Zeeshan", "Ahsan", "Haseeb","Zeeshan", "Ahsan", "Haseeb")
        var arrayAdapter : ArrayAdapter<String> = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1, myArray)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener(object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long){
                var positionData = myArray[position]
                Toast.makeText(this@MainActivity, "$positionData\nIndex : ${position+1}", Toast.LENGTH_SHORT).show()
            }
        })

    }
}
