package com.example.bomjara.activity

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.bomjara.R
//import com.example.bomjara.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.system.exitProcess

class GameActivity : AppCompatActivity() {
    private var timeBP = 0L
    private var toastBP: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        actionBar?.hide()

        var buttonsNV = findViewById<BottomNavigationView>(R.id.buttons_nav)
        var navController = findNavController(R.id.nav_game_activity)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_info, R.id.nav_health, R.id.nav_recreation, R.id.nav_work
            )
        )

//        setupActionBarWithNavController(navController, appBarConfiguration)
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