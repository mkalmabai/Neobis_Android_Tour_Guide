package com.example.neobis_android_tour_guide.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.R

class RecyclerAdapter(val names : List<String>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {
    class ViewHolder(sitemView: View):RecyclerView.ViewHolder(sitemView) {
        val largeTextView: TextView = sitemView.findViewById(R.id.itemAddressName)
        val smallTextView: TextView = sitemView.findViewById(R.id.itemWorkTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val sitemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,parent,false)
        return ViewHolder(sitemView)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.largeTextView.text = names[position]
        holder.smallTextView.text = "cat"
    }

}