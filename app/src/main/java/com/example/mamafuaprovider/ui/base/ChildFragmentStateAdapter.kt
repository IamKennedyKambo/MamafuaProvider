package com.example.mamafuaprovider.ui.base

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mamafuaprovider.ui.jobs.CompletedFragment
import com.example.mamafuaprovider.ui.jobs.PendingFragment

class ChildFragmentStateAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PendingFragment()
            else -> CompletedFragment()
        }
    }
}