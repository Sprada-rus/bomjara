package com.example.bomjara.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bomjara.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class GameActivity : AppCompatActivity() {
    private var timeBP = 0L
    private var toastBP: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var buttonsNV = findViewById<BottomNavigationView>(R.id.buttons_nav)
        var navController = findNavController(R.id.nav_game_activity)

        buttonsNV.setupWithNavController(navController)
    }

    override fun onBackPressed() {
        if (timeBP + 2000 > System.currentTimeMillis()) {
            toastBP?.cancel()
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("EXIT", true)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        } else {
            toastBP = Toast.makeText(this, R.string.toast_vack_pressed, Toast.LENGTH_SHORT)
            toastBP?.show()
        }
        timeBP = System.currentTimeMillis()
    }
}