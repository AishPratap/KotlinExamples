package adapters

import Model.Video
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.aishwarya.kotlinexample.R

/**
 * Created by aishpratap on 5/25/17.
 */

class VideoListAdapter(context: Context, private val videos: List<Video>) : ArrayAdapter<Video>(context, R.layout.custom_listview, videos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val cellView = layoutInflater.inflate(R.layout.custom_listview, parent, false)

        val video_bitmap = cellView.findViewById(R.id.video_bitmap) as ImageView
        video_bitmap.setImageResource(videos[position].bitmap)
        val title_view = cellView.findViewById(R.id.title) as TextView
        title_view.text = videos[position].title
        val description_view = cellView.findViewById(R.id.description) as TextView
        description_view.text = videos[position].description
        return cellView
    }
}
