package com.qiantao.liveflux.main.fragment


import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.qiantao.liveflux.R
import com.qiantao.liveflux.lifecycle.LifecycleFragment
import com.qiantao.liveflux.main.MainStore
import kotlinx.android.synthetic.main.fragment_above.*

/**
 * A simple [Fragment] subclass.
 *
 */
class AboveFragment : LifecycleFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_above, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MainStore.observe(this, Observer {
            Log.i("AboveFragment", "it: $it")
            etxt_above.text = it
        })
    }

}
