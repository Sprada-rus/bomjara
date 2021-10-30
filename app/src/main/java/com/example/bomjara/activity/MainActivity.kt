package com.example.bomjara.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.bomjara.R

class MainActivity : AppCompatActivity() {
    var continueBtn: Button? = null
    var newGameBtn: Button? = null
    var infoBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        continueBtn = findViewById(R.id.continue_btn)
        newGameBtn = findViewById(R.id.new_game_btn)
        infoBtn = findViewById(R.id.info_btn)

        //Проверяем есть ли сохаренение и указываем отображение кнопки "Продолжить"
        checkSave()

        //Блок слушателей
        continueBtn?.setOnClickListener(this::continueListener)
        newGameBtn?.setOnClickListener(this::newGameListener)
        infoBtn?.setOnClickListener(this::infoListener)
    }

    private fun checkSave(){
        continueBtn?.visibility = View.INVISIBLE
    }

    private fun continueListener(view: View){
        val intent = Intent(this, GameActivity::class.java)
        intent.putExtra("HAS_SAVE", true)
        startActivity(intent)
    }

    private fun newGameListener(view: View){
        val intent = Intent(this, GameActivity::class.java)
        intent.putExtra("HAS_SAVE", false)
        startActivity(intent)
    }

    private fun infoListener(view: View){
        val intent = Intent(this, InfoActivity::class.java)
        startActivity(intent)
    }
}