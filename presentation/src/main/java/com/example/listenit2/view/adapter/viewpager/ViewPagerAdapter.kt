package com.example.listenit2.view.adapter.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.listenit2.view.fragment.MainFragment
import com.example.listenit2.view.fragment.ProfileFragment
import com.example.listenit2.view.fragment.SearchFragment

class ViewPagerAdapter (fragment : FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> MainFragment()
            1 -> SearchFragment()
            else -> ProfileFragment()
        }
    }

}