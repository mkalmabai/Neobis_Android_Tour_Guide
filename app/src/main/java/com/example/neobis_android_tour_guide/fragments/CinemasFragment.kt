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
import com.example.neobis_android_tour_guide.databinding.FragmentCinemasBinding

class CinemasFragment : Fragment(), Clickable {
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
        val recyclerView: RecyclerView = binding.recyclerViewCinemas
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RecyclerAdapter(fillList(), this)
    }
    private fun fillList(): ArrayList<DataPlaces> {
        val data = arrayListOf(


            DataPlaces(R.drawable.chaplin, getString(R.string.nameChaplin), getString(R.string.addressChaplin), getString(
                R.string.timeChaplin), getString(R.string.distanceChaplin),getString(R.string.descriptionChaplin)),
            DataPlaces(R.drawable.arman, getString(R.string.nameArman), getString(R.string.addressArman), getString(
                R.string.timeArman), getString(R.string.distanceArman),getString(R.string.descriptionArman)),
            DataPlaces(R.drawable.keruen, getString(R.string.nameKeruen), getString(R.string.addressKeruen), getString(
                R.string.timeKeruen), getString(R.string.distanceKeruen),getString(R.string.descriptionKeruen)),
            DataPlaces(R.drawable.kinopark, getString(R.string.nameKinopark), getString(R.string.addressKinopark), getString(
                R.string.timeKinopark), getString(R.string.distanceKinopark),getString(R.string.descriptionKinopark)),


            )
        return data
    }

    override fun onItemClickListener(dataPlaces: DataPlaces) {
        val bundle = Bundle()
        bundle.putParcelable("dataPlaces", dataPlaces)
        findNavController().navigate(R.id.action_mainFragment2_to_detailFragment23, bundle)
//
//        val action = MainFragmentDirections.actionMainFragment2ToDetailFragment23(dataPlaces)
//        findNavController().navigate(action)
    }
}