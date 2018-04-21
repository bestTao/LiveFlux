package com.qiantao.liveflux.main

import android.os.Bundle
import com.qiantao.liveflux.R
import com.qiantao.liveflux.lifecycle.LifecycleActivity
import com.qiantao.liveflux.main.fragment.AboveFragment
import com.qiantao.liveflux.main.fragment.BelowFragment

class MainActivity : LifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_above, AboveFragment())
                .add(R.id.fl_below, BelowFragment())
                .commitAllowingStateLoss()
    }
}
