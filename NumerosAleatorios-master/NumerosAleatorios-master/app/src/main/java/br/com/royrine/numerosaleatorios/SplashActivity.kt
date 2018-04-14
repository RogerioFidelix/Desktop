package br.com.royrine.numerosaleatorios

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    val tempoDoSplash = 2500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        carregar()
    }
    //git add .  /  git commit -m ""  / git push origin master
    fun carregar () {
        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        }, tempoDoSplash)
    }
}

