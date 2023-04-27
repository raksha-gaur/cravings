package com.internshala.foodrunner.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.internshala.foodrunner.R
import com.internshala.foodrunner.activity.ReaderActivity
import com.internshala.foodrunner.util.DrawerLocker


class QrCodeFragment : Fragment() {

    private lateinit var textView: TextView
    private lateinit var button: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_qr_code, container, false)
        (activity as DrawerLocker).setDrawerEnabled(true)


        button = view.findViewById(R.id.button)
        textView = view.findViewById(R.id.textView)
        button.setOnClickListener {
            turnOnScanner()
        }
        return view

    }

    private fun turnOnScanner(){
        val intent = Intent(activity, ReaderActivity::class.java)
        startActivity(intent)
    }

}

