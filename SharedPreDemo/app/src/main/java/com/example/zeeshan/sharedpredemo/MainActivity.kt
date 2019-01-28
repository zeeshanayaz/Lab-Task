package com.example.zeeshan.sharedpredemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user_name = findViewById<EditText>(R.id.user_name)
        var user_password = findViewById<EditText>(R.id.user_password)
        var user_submit_btn = findViewById<Button>(R.id.user_submit_btn)


        user_submit_btn.setOnClickListener {
            if (!user_name.text.isEmpty()){
                if(!user_password.text.isEmpty()){
                    saveUser(user_name.text.toString(), user_password.text.toString())
                }else{user_name.setError("Enter Password")}
            }else{user_name.setError("Enter User Name")}
        }

        val sharedPreferences = getSharedPreferences("user", 0)
        val name = sharedPreferences.getString("name", "No Name")
        val password = sharedPreferences.getString("password", "No Password")

        Toast.makeText(this@MainActivity, name, Toast.LENGTH_SHORT).show()
        Toast.makeText(this@MainActivity, password, Toast.LENGTH_SHORT).show()


    }

    private fun saveUser(name: String, password: String) {
        val sharedPreferences = getSharedPreferences("user", 0) //Mode 0 is private and 1 is for public
        val editor = sharedPreferences.edit()
        editor.putString("name",name).apply()
        editor.putString("password",password).apply()

        Toast.makeText(this@MainActivity, "Successfully Added", Toast.LENGTH_SHORT).show()
    }
}
