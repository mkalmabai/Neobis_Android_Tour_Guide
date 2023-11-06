package com.example.neobis_android_tour_guide.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.R
import com.example.neobis_android_tour_guide.data.DataPlaces
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding
import com.example.neobis_android_tour_guide.databinding.RecyclerviewItemBinding
import com.example.neobis_android_tour_guide.fragments.DetailFragment


interface Clickable{
 fun onItemClickListener(dataPlaces: DataPlaces)
}

class RecyclerAdapter(val dataPlaces : ArrayList<DataPlaces>, val clickable: Clickable): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {
    class ViewHolder(private val binding: RecyclerviewItemBinding):RecyclerView.ViewHolder(binding.root) {
        val imagePlaces = binding.itemImagePlaces
        val namePlaces = binding.itemNamePlaces
        val addressName = binding.itemAddressName
        val workTime = binding.itemWorkTime
        val distance = binding.itemDistances
        val itemCardId = binding.itemCardId
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
        holder.itemCardId.setOnClickListener{
            clickable.onItemClickListener(dataplace)
        }
    }

}