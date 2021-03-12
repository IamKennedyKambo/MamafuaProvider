package com.example.mamafuaprovider.ui.jobs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mamafuaprovider.databinding.ActivityScrollingBinding
import com.example.mamafuaprovider.ui.base.ChildFragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator

class JobsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = ChildFragmentStateAdapter(this)

        // Bind tabs and viewpager
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Pending"
                1 -> tab.text = "Completed"
            }
        }.attach()
    }
}