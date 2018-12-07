package com.example.zeeshan.drawerlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.my_menu_1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        return super.onOptionsItemSelected(item)
        when(item!!.itemId){
            R.id.menu_option1 ->{
                Toast.makeText(this@MainActivity, "Option 1 Selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_option2 ->{
                Toast.makeText(this@MainActivity, "Option 2 Selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_option3 ->{
                Toast.makeText(this@MainActivity, "Option 3 Selected", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return false
        }
    }
}
