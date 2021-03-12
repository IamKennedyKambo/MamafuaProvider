package com.example.mamafuaprovider.ui.jobs

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mamafuaprovider.R
import com.example.mamafuaprovider.databinding.FragmentCompletedBinding

class CompletedFragment : Fragment(R.layout.fragment_completed) {

    private lateinit var binding: FragmentCompletedBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCompletedBinding.bind(view)
    }
}