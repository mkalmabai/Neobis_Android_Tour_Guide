package com.example.neobis_android_tour_guide.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.neobis_android_tour_guide.fragments.CinemasFragment
import com.example.neobis_android_tour_guide.fragments.FitnessCentersFragment
import com.example.neobis_android_tour_guide.fragments.RestaurantsFragment

private const val NUMBER_TABS = 3

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):
                        FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
        return NUMBER_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
                0-> return RestaurantsFragment()
                1-> return FitnessCentersFragment()
        }
        return CinemasFragment()
    }
}