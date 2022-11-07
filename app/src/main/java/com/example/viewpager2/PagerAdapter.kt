package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity: FragmentActivity, fragList: List<Fragment>) :
    FragmentStateAdapter(fragmentActivity) {
    var fragmentList: List<Fragment> = fragList
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = fragmentList[position]

        fragment.arguments = Bundle().apply {
            putInt("ARG_OBJECT", position + 1)
        }

        return fragment
    }
}