package com.sample.navcontrollerbottomnav

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AgendaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val textView = TextView( inflater.context )
        textView.text = "Agenda Fragment"
        return textView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d( TAG, "LifeCycle - onCreate $this")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d( TAG, "LifeCycle - onViewCreated $this")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d( TAG, "LifeCycle - onDestroyView $this")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d( TAG, "LifeCycle - onDestroy $this")
    }

    companion object {
        private const val TAG = "AgendaFragment"
    }
}
