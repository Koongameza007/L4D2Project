package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_modemain.*
import kotlinx.android.synthetic.main.activity_modemain.lightmachinegun
import kotlinx.android.synthetic.main.activity_survivormain.backbt
import kotlinx.android.synthetic.main.activity_weaponmain.*

class Weaponmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weaponmain)

        pistol.setOnClickListener {

            val it = Intent(this, Pistol::class.java)
            startActivity(it)
            finish()
        }

        lightmachinegun.setOnClickListener {

            val it = Intent(this, Lightmachinegun::class.java)
            startActivity(it)
            finish()
        }
        assaultrifle.setOnClickListener {
            val it = Intent(this, Assaultrifle::class.java)
            startActivity(it)
            finish()
        }
        sniperrifle.setOnClickListener {
            val it = Intent(this, Sniperrifle::class.java)
            startActivity(it)
            finish()
        }
        shotgun.setOnClickListener {
            val it = Intent(this, Shotgun::class.java)
            startActivity(it)
            finish()
        }
        meleeweapon.setOnClickListener {
            val it = Intent(this, Meleeweapon::class.java)
            startActivity(it)
            finish()
        }
        throwingweapon.setOnClickListener {
            val it = Intent(this, Throwingweapon::class.java)
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