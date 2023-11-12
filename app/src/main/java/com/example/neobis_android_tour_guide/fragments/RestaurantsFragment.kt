package com.example.neobis_android_tour_guide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.R
import com.example.neobis_android_tour_guide.adapter.Clickable
import com.example.neobis_android_tour_guide.adapter.RecyclerAdapter
import com.example.neobis_android_tour_guide.data.DataPlaces
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding


class RestaurantsFragment : Fragment(),Clickable {
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
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.recyclerViewRestaurants
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RecyclerAdapter(fillList(),this)
    }
    private fun fillList(): ArrayList<DataPlaces> {
        val data = arrayListOf(
            DataPlaces(
                R.drawable.oceanbasket, getString(R.string.nameOceanbasket), getString(R.string.addressOceanbasket), getString(
                R.string.timeOceanbasket), getString(R.string.distanceOceanbasket),getString(R.string.descriptionrestourant), getString(R.string.location)),
            DataPlaces(
                R.drawable.sf, getString(R.string.namesf), getString(R.string.addresssf), getString(
                R.string.timesf), getString(R.string.distancesf),getString(R.string.descriptionrestourant), getString(R.string.location)),
            DataPlaces(
                R.drawable.farsh, getString(R.string.nameFarsh ), getString(R.string.addressFarsh), getString(
                R.string.timeFarsh), getString(R.string.distanceFarsh),getString(R.string.descriptionrestourant), getString(R.string.location)),
        )
        return data
    }

    override fun onItemClickListener(dataPlaces: DataPlaces) {
        val bundle = Bundle()
        bundle.putParcelable("dataPlaces", dataPlaces)
        findNavController().navigate(R.id.action_mainFragment2_to_detailFragment23, bundle)
    }
}
