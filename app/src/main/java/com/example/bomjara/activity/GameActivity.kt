package com.example.bomjara.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bomjara.R
import com.example.bomjara.game_object.GameObject
import com.example.bomjara.game_object.gameObject
import com.google.android.material.bottomnavigation.BottomNavigationView


public class GameActivity : AppCompatActivity() {
    private var timeBP = 0L
    private var toastBP: Toast? = null
    private var tvHealth: TextView? = null
    private var tvRecreation: TextView? = null
    private var tvMoney: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val buttonsNV = findViewById<BottomNavigationView>(R.id.buttons_nav)
        val navController = findNavController(R.id.nav_game_activity)

        buttonsNV.setupWithNavController(navController)

        if (!intent.getBooleanExtra("HAS_SAVE", false)){
            gameObject = GameObject(
                18,
                0,
                50,
                50,
                null,
                null
            )

            tvHealth = findViewById(R.id.health_count)
            tvRecreation = findViewById(R.id.recreation_count)
            tvMoney = findViewById(R.id.money_count)

            tvHealth?.text = gameObject?.health.toString()
            tvRecreation?.text = gameObject?.happens.toString()
            tvMoney?.text = gameObject?.money.toString()
        }
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

    fun changeProperty(property: String, num: Int){

        when(property){
            "health" -> {
                tvHealth?.text = (tvHealth?.text.toString().toInt() + num).toString()
                gameObject?.nextDay()
            }
            "happens" -> {
                tvRecreation?.text = (tvRecreation?.text.toString().toInt() + num).toString()
                gameObject?.nextDay()
            }
            "money" -> {
                tvMoney?.text = (tvMoney?.text.toString().toInt() + num).toString()
                gameObject?.nextDay()
            }
            else -> {
                Toast.makeText(this, "Unknown property", Toast.LENGTH_SHORT).show()
            }
        }
    }

}