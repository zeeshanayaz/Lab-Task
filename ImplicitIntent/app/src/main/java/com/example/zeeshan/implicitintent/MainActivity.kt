package com.example.zeeshan.implicitintent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var map = findViewById<Button>(R.id.map_intent_Btn)
        var browser = findViewById<Button>(R.id.browser_intent_Btn)
        var dial = findViewById<Button>(R.id.dial_intent_Btn)
        var clock = findViewById<Button>(R.id.clock_intent_Btn)
        var camera = findViewById<Button>(R.id.camera_intent_Btn)

        map.setOnClickListener{
            // Map point based on address
            val mapIntent: Intent = Uri.parse(
                    "geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California"
            ).let { location ->
                // Or map point based on latitude/longitude
                // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
                Intent(Intent.ACTION_VIEW, location)
            }
            startActivity(mapIntent)
        }

        browser.setOnClickListener{
            val webIntent: Intent = Uri.parse("http://www.android.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)
        }

        dial.setOnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:00000000")
            startActivity(dialIntent)
        }

        clock.setOnClickListener{
            val alarmIntent = Intent(AlarmClock.ACTION_SET_ALARM)
            alarmIntent.putExtra(AlarmClock.EXTRA_MESSAGE, "My ALarm")
            alarmIntent.putExtra(AlarmClock.EXTRA_HOUR, "10")
            alarmIntent.putExtra(AlarmClock.EXTRA_MINUTES, "32")
            alarmIntent.putExtra(AlarmClock.EXTRA_DAYS, "2,3,4")

            startActivity(alarmIntent)
        }

        camera.setOnClickListener{

        }








    }
}
