package com.example.neobis_android_tour_guide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neobis_android_tour_guide.adapter.RecyclerAdapter
import com.example.neobis_android_tour_guide.databinding.FragmentFitnessCentersBinding

class FitnessCentersFragment : Fragment() {
    private var _binding: FragmentFitnessCentersBinding? = null
    private val binding get() = _binding!!
    private val namesList = listOf<String>("aeeeee","asda","asaaaaaaaaaa")

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
        binding.recyclerViewfitness.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewfitness.adapter = RecyclerAdapter(namesList)
    }
}