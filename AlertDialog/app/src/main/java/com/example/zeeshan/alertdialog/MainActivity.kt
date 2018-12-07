package com.example.zeeshan.alertdialog

import android.app.Application
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById<Button>(R.id.close_button)

        button.setOnClickListener {
            showPopup()
        }
    }


    private fun showPopup(){
        val dialogBuilder = AlertDialog.Builder(this@MainActivity)
        val create: AlertDialog = dialogBuilder.create()

        dialogBuilder.setCancelable(false)

        dialogBuilder.setTitle("Close Application?")
        dialogBuilder.setMessage("Do you want to close application?")

        dialogBuilder.setPositiveButton("Yes", object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                finishAffinity()
            }

        })

        dialogBuilder.setNegativeButton("No", object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                create.dismiss()
                Toast.makeText(this@MainActivity, "Application is running", Toast.LENGTH_SHORT).show()
            }

        })
        dialogBuilder.create()
        dialogBuilder.show()
    }
}
