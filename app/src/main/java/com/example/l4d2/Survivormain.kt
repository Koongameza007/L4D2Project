package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_survivormain.*

class Survivormain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survivormain)

        nickbt.setOnClickListener {

            val it = Intent(this, Nick::class.java)
            startActivity(it)
            finish()
        }
        rochellebt.setOnClickListener {

            val it = Intent(this, Rochelle::class.java)
            startActivity(it)
            finish()
        }
        coachbt.setOnClickListener {

            val it = Intent(this, Coach::class.java)
            startActivity(it)
            finish()
        }
        ellisbt.setOnClickListener {

            val it = Intent(this, Ellis::class.java)
            startActivity(it)
            finish()
        }
        backbt.setOnClickListener {

            val it = Intent(this, Main::class.java)
            startActivity(it)
            finish()
        }

    }
}