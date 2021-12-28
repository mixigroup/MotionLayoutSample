package jp.co.mixi.motionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Sample3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample3)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ListAdapter()

    }

    class ListAdapter : RecyclerView.Adapter<ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(TextView(parent.context))
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView.text = position.toString()
        }

        override fun getItemCount(): Int {
            return 200
        }
    }

    class ViewHolder(
        val textView: TextView
    ) : RecyclerView.ViewHolder(textView)
}