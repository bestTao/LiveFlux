package com.qiantao.liveflux.main.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qiantao.liveflux.R
import com.qiantao.liveflux.lifecycle.LifecycleFragment
import com.qiantao.liveflux.main.MainAction
import kotlinx.android.synthetic.main.fragment_below.*

/**
 * A simple [Fragment] subclass.
 *
 */
class BelowFragment : LifecycleFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_below, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        etxt_below.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                MainAction.create(s.toString())
            }
        })
    }


}
