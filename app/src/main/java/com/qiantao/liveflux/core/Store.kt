package com.qiantao.liveflux.core

import android.arch.lifecycle.LiveData
import android.util.Log

/**
 * Created by qiantao on 2018/4/21 0021
 */
open class Store<T> : LiveData<T>() {

    private var latestValue: T? = null

    fun emmit(value: T?) {
        this.value = value
    }

    override fun setValue(value: T?) {
        save(value)
        super.setValue(value)
        Log.d("Store", "set value: $value")
    }

    override fun postValue(value: T?) {
        save(value)
        super.postValue(value)
    }

    private fun save(value: T?) {
        latestValue = value
    }

    override fun onActive() {
        if (latestValue != null)
            value = latestValue
    }

}