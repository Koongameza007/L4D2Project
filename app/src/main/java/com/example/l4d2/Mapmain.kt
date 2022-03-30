package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mapmain.*
import kotlinx.android.synthetic.main.activity_modemain.*
import kotlinx.android.synthetic.main.activity_survivormain.*
import kotlinx.android.synthetic.main.activity_survivormain.backbt

class Mapmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapmain)
        backbt.setOnClickListener {

            val it = Intent(this, Main::class.java)
            startActivity(it)
            finish()
        }
        deadcenter.setOnClickListener {

            val it = Intent(this, Deadcenter::class.java)
            startActivity(it)
            finish()
        }
        thepassing.setOnClickListener {

            val it = Intent(this, Thepassing::class.java)
            startActivity(it)
            finish()
        }
        darkcarnival.setOnClickListener {

            val it = Intent(this, Darkcarnival::class.java)
            startActivity(it)
            finish()
        }
        swampfever.setOnClickListener {

            val it = Intent(this, Swampfever::class.java)
            startActivity(it)
            finish()
        }
        hardrain.setOnClickListener {

            val it = Intent(this, Hardrain::class.java)
            startActivity(it)
            finish()
        }
        theparish.setOnClickListener {

            val it = Intent(this, Theparish::class.java)
            startActivity(it)
            finish()
        }
    }
}