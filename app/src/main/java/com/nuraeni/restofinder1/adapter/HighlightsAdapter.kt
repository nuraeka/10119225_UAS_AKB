package com.nuraeni.restofinder1.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nuraeni.restofinder1.R
import com.nuraeni.restofinder1.model.ModelHighlights
import kotlinx.android.synthetic.main.list_item_highlights.view.*

class HighlightsAdapter (

    private val items: List<ModelHighlights>) : RecyclerView.Adapter<HighlightsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_highlights, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = items[position]
        holder.tvHighlights.text = data.highlights
    }

    override fun getItemCount(): Int {
        return items.size
    }

    //Class Holder
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvHighlights: TextView

        init {
            tvHighlights = itemView.tvHighlights
        }
    }
}