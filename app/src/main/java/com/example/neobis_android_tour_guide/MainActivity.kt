package com.example.neobis_android_tour_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_tour_guide.adapter.ViewPagerAdapter
import com.example.neobis_android_tour_guide.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

val placesToVisit = arrayOf(
    "Рестораны",
    "Фитнес центры",
    "Кинотетры"
)
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = placesToVisit[position]
        }.attach()
    }
}