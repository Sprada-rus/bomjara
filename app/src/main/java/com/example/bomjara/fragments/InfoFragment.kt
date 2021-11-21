package com.example.bomjara.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bomjara.R
import com.example.bomjara.R.layout.*
import com.example.bomjara.game_object.GameObject
import com.example.bomjara.game_object.gameObject
import com.example.bomjara.R.layout.fragment_info as fragment_info1

class InfoFragment : Fragment() {
    private var tvName:TextView? = null
    private var tvAge:TextView? = null
    private var tvMoney:TextView? = null


    override fun onCreateView(inflater: LayoutInflater
                              , container: ViewGroup?
                              ,savedInstanceState: Bundle?): View?
    {
        var view = inflater.inflate(R.layout.fragment_info, container, false)
//        tvName = view.findViewById<TextView>(R.id.info_object_name)
        tvAge = view.findViewById<TextView>(R.id.info_object_age)
        tvMoney = view.findViewById<TextView>(R.id.info_object_money)

        tvName?.text = "null"
        tvAge?.text = "null"
        tvMoney?.text = "0"

        gameObject?.let {
//            tvName?.text = it.name
            tvAge?.text = it.years.toString()
            tvMoney?.text = it.money.toString()
//            tvVehicle?.setText(it.money)
//            tvRealty?.setText(it.vehicle)
//            tvStatus?.setText(it.)
        }

        return view
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        tvName = view.findViewById(R.id.info_object_name)
//        tvMoney = view.findViewById(R.id.info_object_money)
//        super.onViewCreated(view, savedInstanceState)
//    }

    override fun onResume() {
//
//
        Log.i("infoFrag", "onResume")
////        gameObject?.let {
////            tvName?.setText(it.name)
////            tvAge?.setText(it.years)
////            tvMoney?.setText(it.money)
//////            tvVehicle?.setText(it.money)
//////            tvRealty?.setText(it.vehicle)
//////            tvStatus?.setText(it.)
////        }
//
//        tvName?.text = gameObject?.name
//        tvAge?.text = gameObject?.years.toString()
//
        super.onResume()
    }

    override fun onStart() {
        Log.i("infoFrag", "onStart")
        super.onStart()
    }
}