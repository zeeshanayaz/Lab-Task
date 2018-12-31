package com.example.zeeshan.restapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import android.os.StrictMode



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHitApi = findViewById<Button>(R.id.btnHitApi)
        val txtView = findViewById<TextView>(R.id.txtView)


        btnHitApi.setOnClickListener {

            try {
                val url = "http://ZEESHAN/JsonFile/sample.json"
                val obj = URL(url)

                with(obj.openConnection() as HttpURLConnection) {
                    // optional default is GET
                    requestMethod = "GET"



                    BufferedReader(InputStreamReader(inputStream)).use {
                        val response = StringBuffer()

                        var inputLine = it.readLine()
                        while (inputLine != null) {
                            response.append(inputLine)
                            inputLine = it.readLine()
                        }
                        txtView.text = response.toString()
                    }
                }
            }
            catch (e: Exception)
            {
                txtView.text = e.message
            }

        }

    }
}

// result generated from /json

data class Base(val glossary: Glossary?)

data class GlossDef(val para: String?, val GlossSeeAlso: List<String>?)

data class GlossDiv(val title: String?, val GlossList: GlossList?)

data class GlossEntry(val ID: String?, val SortAs: String?, val GlossTerm: String?, val Acronym: String?, val Abbrev: String?, val GlossDef: GlossDef?, val GlossSee: String?)

data class GlossList(val GlossEntry: GlossEntry?)

data class Glossary(val title: String?, val GlossDiv: GlossDiv?)

