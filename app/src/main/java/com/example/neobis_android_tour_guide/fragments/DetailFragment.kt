package com.example.neobis_android_tour_guide.fragments

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.neobis_android_tour_guide.R
import com.example.neobis_android_tour_guide.data.DataPlaces
import com.example.neobis_android_tour_guide.databinding.FragmentCinemasBinding
import com.example.neobis_android_tour_guide.databinding.FragmentDetailBinding
import com.squareup.picasso.Picasso


class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataPlaces = arguments?.getParcelable<DataPlaces>("dataPlaces")
        dataPlaces?.image?.let { binding.imageDetail.setImageResource(it) }
        binding.addressDetail.text = dataPlaces?.address
        binding.workTimeDetail.text = dataPlaces?.worktime
        binding.distanceDetail.text = dataPlaces?.distance
        binding.nameOfDescriptionDetail.text = dataPlaces?.namePlace
        binding.titleDetail.text = dataPlaces?.namePlace
        binding.description.text = dataPlaces?.description

        binding.backButton.setOnClickListener{
            findNavController().navigate(R.id.action_detailFragment2_to_mainFragment23)
        }
    }

}