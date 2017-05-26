package com.aishwarya.kotlinexample

import Model.Video
import adapters.VideoListAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView


class MainActivity : AppCompatActivity() {


//    val dataSource = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    var videos:MutableList<Video>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val video1 = Video("1", "Sunday", "Weekday1", R.drawable.fig10);
        val video2 = Video("2", "Monday", "Weekday2", R.drawable.fig10);
        val video3 = Video("3", "Tuesday", "Weekday3", R.drawable.fig10);
        val video4 = Video("4", "Wednesday", "Weekday4", R.drawable.fig10);

        videos?.add(video1)
        videos?.add(video2)
        videos?.add(video3)
        videos?.add(video4)

        populateData()
    }

    private fun populateData() {

        val listView = findViewById(R.id.listView) as ListView
        val adapter = VideoListAdapter(this, videos as List<Video>)

        listView.adapter = adapter

//        listView.setOnItemClickListener{ parent, view, position, id ->
//
//            val containerView = view as View
//            val textView = containerView.findViewById(R.id.title) as TextView
//            Toast.makeText(this, textView.text, Toast.LENGTH_SHORT).show()
//        }
    }


}
