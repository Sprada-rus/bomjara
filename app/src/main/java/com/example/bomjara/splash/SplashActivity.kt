package com.example.bomjara.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import androidx.core.content.ContextCompat
import com.example.bomjara.R
import com.example.bomjara.activity.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var progressBar = findViewById<ProgressBar>(R.id.progressBar)

        progressBar.setProgressDrawableTiled(ContextCompat.getDrawable(this, R.drawable.progresbar))

        var handler = Handler()
        handler.postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK))
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

                finish()
            },
            2000
        )
    }
}