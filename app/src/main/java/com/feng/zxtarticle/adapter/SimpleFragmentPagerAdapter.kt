package com.feng.zxtarticle.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

import com.feng.zxtarticle.fragment.PageFragment

/**
 * 作者: feng on 2017/5/4.
 * 网址:http://www.cnblogs.com/simadi/  https://github.com/simadi
 */

class SimpleFragmentPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {

    private val tabTitles = arrayOf("最新", "推荐", "热门", "名人")

    override fun getItem(position: Int): Fragment {
        return PageFragment.newInstance(position + 1)
    }

    override fun getCount(): Int {
        return tabTitles.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return tabTitles[position]
    }
}