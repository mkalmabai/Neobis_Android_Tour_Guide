package com.example.neobis_android_tour_guide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.R
import com.example.neobis_android_tour_guide.adapter.Clickable
import com.example.neobis_android_tour_guide.adapter.RecyclerAdapter
import com.example.neobis_android_tour_guide.data.DataPlaces
import com.example.neobis_android_tour_guide.databinding.FragmentFitnessCentersBinding

class FitnessCentersFragment : Fragment(),Clickable{
    private var _binding: FragmentFitnessCentersBinding? = null
    private val binding get() = _binding!!
    private val namesList = ArrayList<DataPlaces>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFitnessCentersBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.recyclerViewFitness
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RecyclerAdapter(fillList(),this)
    }
    private fun fillList(): ArrayList<DataPlaces> {
        val data = arrayListOf(

            DataPlaces(R.drawable.bronx , getString(R.string.nameBronx), getString(R.string.addressBronx), getString(
                R.string.timeBronx), getString(R.string.distanceBronx)),
            DataPlaces(R.drawable.invictus, getString(R.string.nameInvictus), getString(R.string.addressInvictus), getString(
                R.string.timeInvictus), getString(R.string.distanceInvictus)),

            )
        return data
    }

    override fun onItemClickListener(dataPlaces: DataPlaces) {
        TODO("Not yet implemented")
    }

}