package com.example.neobis_android_tour_guide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding


class RestaurantsFragment : Fragment() {
    private var _binding: FragmentRestaurantsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRestaurantsBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
}