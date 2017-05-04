package com.feng.zxtarticle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.feng.zxtarticle.adapter.SimpleFragmentPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagerAdapter: SimpleFragmentPagerAdapter = SimpleFragmentPagerAdapter(supportFragmentManager, this)
         val viewPager: ViewPager =  findViewById(R.id.viewpager) as ViewPager
        viewPager.setAdapter(pagerAdapter)

        val tabLayout: TabLayout= findViewById(R.id.sliding_tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setTabMode(TabLayout.MODE_FIXED)
    }
}
