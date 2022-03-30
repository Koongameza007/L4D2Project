package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    var auth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()
        if (auth!!.currentUser != null) {
            val it = Intent(this, Main::class.java)
            startActivity(it)
            finish()
        }
        loginlogin.setOnClickListener {
            val email = emaillogin.text.toString().trim()
            val pass = passwordlogin.text.toString().trim()

            if (email.isEmpty()){
                Toast.makeText(this,"กรุณากรอก Email", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass.isEmpty()){
                Toast.makeText(this,"กรุณากรอก Password", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            auth!!.signInWithEmailAndPassword(email,pass).addOnCompleteListener {task ->
                if (!task.isSuccessful){
                    if (pass.length<8){
                        passwordlogin.error = "กรอกรหัสผ่านให้มากกว่า 8 ตัวอักษร"
                    }else {
                        Toast.makeText(this, "Login ล้มเหลว เนื่องจาก : " + task.exception!!.message,
                            Toast.LENGTH_LONG).show()
                    }
                }else{
                    Toast.makeText(this,"Login Success!", Toast.LENGTH_LONG).show()
                    val it = Intent(this, Main::class.java)
                    startActivity(it)
                    finish()
                }
            }
        }
        registerlogin.setOnClickListener {
            val i = Intent(this, Register::class.java)
            startActivity(i)
        }
        cancellogin.setOnClickListener {
            emaillogin.setText("")
            passwordlogin.setText("")
        }
    }
}