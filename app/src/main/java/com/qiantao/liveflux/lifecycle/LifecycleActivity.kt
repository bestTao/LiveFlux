package com.qiantao.liveflux.lifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.support.v7.app.AppCompatActivity

/**
 * Created by qiantao on 2018/4/21 0021
 */
open class LifecycleActivity : AppCompatActivity(), LifecycleOwner {

    override fun getLifecycle(): Lifecycle = LifecycleRegistry(this)

}