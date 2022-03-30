package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_modemain.*
import kotlinx.android.synthetic.main.activity_survivormain.backbt

class Modemain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modemain)

        backbt.setOnClickListener {

            val it = Intent(this, Main::class.java)
            startActivity(it)
            finish()
        }
        lightmachinegun.setOnClickListener {

            val it = Intent(this, Campaign::class.java)
            startActivity(it)
            finish()
        }
        mutation.setOnClickListener {

            val it = Intent(this, Mutation::class.java)
            startActivity(it)
            finish()
        }
        realism.setOnClickListener {

            val it = Intent(this, Realism::class.java)
            startActivity(it)
            finish()
        }
        versus.setOnClickListener {

            val it = Intent(this, Versus::class.java)
            startActivity(it)
            finish()
        }
        realismversus.setOnClickListener {

            val it = Intent(this, Realismversus::class.java)
            startActivity(it)
            finish()
        }
        survival.setOnClickListener {

            val it = Intent(this, Survival::class.java)
            startActivity(it)
            finish()
        }
        versussurvival.setOnClickListener {

            val it = Intent(this, Versussurvival::class.java)
            startActivity(it)
            finish()
        }
        scavenge.setOnClickListener {

            val it = Intent(this, Scavenge::class.java)
            startActivity(it)
            finish()
        }
    }
}