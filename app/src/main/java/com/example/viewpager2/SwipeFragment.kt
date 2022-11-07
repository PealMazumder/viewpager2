package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2.databinding.FragmentSwipeBinding

class SwipeFragment : Fragment() {
    lateinit var binding: FragmentSwipeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSwipeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey("ARG_OBJECT") }?.apply {
            binding.tvMessage.text = getInt("ARG_OBJECT").toString()
        }
    }
}