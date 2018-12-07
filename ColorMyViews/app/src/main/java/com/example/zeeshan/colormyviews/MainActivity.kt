package com.example.zeeshan.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews : List<View> = listOf(textBox_One, textBox_Two, textBox_Three, textBox_Four, textBox_Five, constraint_layout, red_Button, yellow_button, green_button)

        for (item in clickableViews){
            item.setOnClickListener{makeColoured(it)}
        }
    }

    private fun makeColoured(view: View){
        when (view.id){
            R.id.textBox_One -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textBox_Two -> view.setBackgroundColor(Color.GRAY)
            R.id.textBox_Three -> view.setBackgroundColor(Color.GREEN)
            R.id.textBox_Four -> view.setBackgroundColor(Color.BLUE)
            R.id.textBox_Five -> view.setBackgroundColor(Color.RED)

            R.id.red_Button -> textBox_Three.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> textBox_Four.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> textBox_Five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
