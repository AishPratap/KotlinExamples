package com.aishwarya.kotlinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    val dataSource = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateData()
    }

    private fun populateData() {

        val listView = findViewById(R.id.listView) as ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dataSource)

        listView.adapter = adapter

        listView.setOnItemClickListener{ parent, view, position, id ->

            val textView = view as TextView
            Toast.makeText(this, textView.text, Toast.LENGTH_SHORT).show()
        }
    }


}
