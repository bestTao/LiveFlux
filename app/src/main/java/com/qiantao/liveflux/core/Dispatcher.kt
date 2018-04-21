package com.qiantao.liveflux.core

import com.qiantao.liveflux.main.MainAction
import com.qiantao.liveflux.main.MainStore

/**
 * Created by qiantao on 2018/4/21 0021
 */
object Dispatcher {

    fun dispatch(action: Action) {
        when (action.type) {
            MainAction.TYPE_MAIN -> {
                MainStore.emmit(action.data as String)
            }
            else -> {
            }
        }
    }

}