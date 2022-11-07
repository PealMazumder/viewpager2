package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.databinding.FragmentPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment : Fragment() {

    lateinit var binding: FragmentPagerBinding
    lateinit var pagerAdapter: PagerAdapter
    lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragList: List<Fragment> =
            listOf(SwipeFragment(), SwipeFragment(), SwipeFragment(), SwipeFragment())
        pagerAdapter = PagerAdapter(requireActivity(), fragList)

        viewPager2 = binding.viewPager
        viewPager2.adapter = pagerAdapter

        val tabLayout = binding.tabLayout
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()
    }

}