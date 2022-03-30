package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lightmachinegun.*

class Pistol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pistol)

        backbt3.setOnClickListener {

            val it = Intent(this, Weaponmain::class.java)
            startActivity(it)
            finish()
        }
    }
}