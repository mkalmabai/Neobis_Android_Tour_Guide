package com.example.neobis_android_tour_guide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.R
import com.example.neobis_android_tour_guide.adapter.RecyclerAdapter
import com.example.neobis_android_tour_guide.data.DataPlaces
import com.example.neobis_android_tour_guide.databinding.FragmentCinemasBinding

class CinemasFragment : Fragment() {
    private var _binding: FragmentCinemasBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCinemasBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RecyclerAdapter(fillList())
    }
    private fun fillList(): ArrayList<DataPlaces> {
        val data = arrayListOf(
            DataPlaces(R.drawable.chaplin, getString(R.string.namePlaces), getString(R.string.AddressName), getString(
                R.string.WorkTime), getString(R.string.Distances) )
        )
        return data
    }
}