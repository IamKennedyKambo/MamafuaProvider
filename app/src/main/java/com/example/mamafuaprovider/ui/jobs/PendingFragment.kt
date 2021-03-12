package com.example.mamafuaprovider.ui.jobs

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mamafuaprovider.R
import com.example.mamafuaprovider.databinding.FragmentPendingBinding

class PendingFragment: Fragment(R.layout.fragment_pending) {

    private lateinit var binding: FragmentPendingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPendingBinding.bind(view)
    }
}