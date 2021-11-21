package com.example.bomjara.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.bomjara.R
import com.example.bomjara.game_object.gameObject

class HealthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_health, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btnList: List<TextView> = listOf(
            view.findViewById(R.id.health_btn_1)
        )

        btnList[0].setOnClickListener {
            gameObject?.addHealth(5)
            activity?.findViewById<TextView>(R.id.health_count)?.text = gameObject?.health.toString()
            gameObject?.nextDay()
        }

        super.onViewCreated(view, savedInstanceState)
    }

}