package com.example.neobis_android_tour_guide.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.R
import com.example.neobis_android_tour_guide.data.DataPlaces
import com.example.neobis_android_tour_guide.databinding.RecyclerviewItemBinding

class RecyclerAdapter(val dataPlaces : ArrayList<DataPlaces>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {
    class ViewHolder(private val binding: RecyclerviewItemBinding):RecyclerView.ViewHolder(binding.root) {
        val imagePlaces = binding.itemImagePlaces
        val namePlaces = binding.itemNamePlaces
        val addressName = binding.itemAddressName
        val workTime = binding.itemWorkTime
        val distance = binding.itemDistances

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerviewItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataPlaces.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataplace = dataPlaces[position]
        holder.imagePlaces.setImageResource(dataplace.image)
        holder.namePlaces.text = dataplace.namePlace
        holder.addressName.text = dataplace.address
        holder.workTime.text = dataplace.worktime
        holder.distance.text = dataplace.distance
    }

}