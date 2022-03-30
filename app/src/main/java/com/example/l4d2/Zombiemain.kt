package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_survivormain.*
import kotlinx.android.synthetic.main.activity_survivormain.backbt
import kotlinx.android.synthetic.main.activity_zombiemain.*

class Zombiemain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zombiemain)

        backbt.setOnClickListener {

            val it = Intent(this, Main::class.java)
            startActivity(it)
            finish()
        }
        zombie.setOnClickListener {

            val it = Intent(this, Zombie::class.java)
            startActivity(it)
            finish()
        }
        boomer.setOnClickListener {

            val it = Intent(this, Boomer::class.java)
            startActivity(it)
            finish()
        }
        hunter.setOnClickListener {

            val it = Intent(this, Hunter::class.java)
            startActivity(it)
            finish()
        }
        smoker.setOnClickListener {

            val it = Intent(this, Smoker::class.java)
            startActivity(it)
            finish()
        }
        tank.setOnClickListener {

            val it = Intent(this, Tank::class.java)
            startActivity(it)
            finish()
        }
        charger.setOnClickListener {

            val it = Intent(this, Charger::class.java)
            startActivity(it)
            finish()
        }
        jockey.setOnClickListener {

            val it = Intent(this, Jockey::class.java)
            startActivity(it)
            finish()
        }
        spitter.setOnClickListener {

            val it = Intent(this, Spitter::class.java)
            startActivity(it)
            finish()
        }
        witch.setOnClickListener {

            val it = Intent(this, Witch::class.java)
            startActivity(it)
            finish()
        }
    }
}