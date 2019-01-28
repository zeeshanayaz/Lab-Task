package com.zeeshan.firebasedemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var databaseRef : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        databaseRef = FirebaseDatabase.getInstance().reference

        val refName = databaseRef.child("Name")

        refName.addListenerForSingleValueEvent(object : ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val data = "Single Calue Listener /n Key: ${dataSnapshot.key} /n Value: ${dataSnapshot.value.toString()}"
                value1_txt.text = data
            }

        })

        refName.addValueEventListener(object : ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val data = "Value Listener /n Key: ${dataSnapshot.key} /n Value: ${dataSnapshot.value.toString()}"
                value2_txt.text = data
            }

        })

        sendValue_btn.setOnClickListener{
            val value = editvalue_et.text.toString()
            databaseRef.child("Name").setValue(value)
        }
    }
}
