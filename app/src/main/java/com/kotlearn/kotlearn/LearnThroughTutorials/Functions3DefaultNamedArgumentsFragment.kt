package com.kotlearn.kotlearn.LearnThroughTutorials


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

import com.kotlearn.kotlearn.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Functions3DefaultNamedArgumentsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_functions3_default_named_arguments, container, false)
        val wb = rootView.findViewById<WebView>(R.id.wbFunctions3)
        wb.loadUrl("file:///android_asset/functions3.html");
        return rootView
    }


}