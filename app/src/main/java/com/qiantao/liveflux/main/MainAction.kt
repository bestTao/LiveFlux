package com.qiantao.liveflux.main

import com.qiantao.liveflux.core.Action
import com.qiantao.liveflux.core.Dispatcher

/**
 * Created by qiantao on 2018/4/21 0021
 */
object MainAction {

    const val TYPE_MAIN = "type_main"

    fun create(value: String) {
        Dispatcher.dispatch(Action(TYPE_MAIN, value))
    }

}