package com.example.zeeshan.checkboxpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var checkbox1 : CheckBox
    private lateinit var CheckText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox1 = findViewById(R.id.checkBox1)
        CheckText = findViewById(R.id.checkTextVIew)

        checkbox1.setOnCheckedChangeListener(object:  CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked){
                    CheckText.text = "True"
                }
                else{
                    CheckText.text = "False"
                }
            }
        })





    }
}
