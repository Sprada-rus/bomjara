package com.example.bomjara.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.bomjara.R

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        actionBar?.hide()

        var arrowBack = findViewById<ImageView>(R.id.arrow_back)

        arrowBack.setOnClickListener(this::pressedArrowBack)
    }

    private fun pressedArrowBack(view: View){
        super.onBackPressed()
    }

}