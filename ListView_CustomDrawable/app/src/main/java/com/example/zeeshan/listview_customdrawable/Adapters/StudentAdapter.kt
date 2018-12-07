package com.example.zeeshan.listview_customdrawable.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.zeeshan.listview_customdrawable.Model.Student
import com.example.zeeshan.listview_customdrawable.R

class StudentAdapter(context : Context, student : List<Student>) : BaseAdapter() {

    val context = context
    val student = student
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val studentView : View

            studentView = LayoutInflater.from(context).inflate(R.layout.student_list_item, null)
            val studentImage : ImageView = studentView.findViewById(R.id.profileImage)
            val studentName : TextView = studentView.findViewById(R.id.nameTextView)
            val studentAge : TextView = studentView.findViewById(R.id.ageTextView)
            val studentEmail : TextView = studentView.findViewById(R.id.emailTextView)

            val student = student[position]

            val resourceID = context.resources.getIdentifier(student.image, "drawable", context.packageName)

        studentName.text = student.name
        studentEmail.text = student.email
        studentAge.text = student.age
        studentImage.setImageResource(resourceID)


        return studentView
    }

    override fun getItem(position: Int): Any {
        return student[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return student.count()
    }


}