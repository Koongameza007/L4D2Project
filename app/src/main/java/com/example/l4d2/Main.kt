package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class Main : AppCompatActivity() {
    var auth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        val userData = auth!!.currentUser
        namemain.text = userData!!.email

        logoutmain.setOnClickListener {
            auth!!.signOut()
            Toast.makeText(this, "Logout Complete", Toast.LENGTH_LONG).show()

            val it = Intent(this, Login::class.java)
            startActivity(it)
            finish()
        }
        survivorbt.setOnClickListener {

            val it = Intent(this, Survivormain::class.java)
            startActivity(it)
            finish()
        }
        zombiebt.setOnClickListener {

            val it = Intent(this, Zombiemain::class.java)
            startActivity(it)
            finish()
        }
        modebt.setOnClickListener {

            val it = Intent(this, Modemain::class.java)
            startActivity(it)
            finish()
        }
        mapbt.setOnClickListener {

            val it = Intent(this, Mapmain::class.java)
            startActivity(it)
            finish()
        }
        weaponbt.setOnClickListener {

            val it = Intent(this, Weaponmain::class.java)
            startActivity(it)
            finish()
        }

    }
}