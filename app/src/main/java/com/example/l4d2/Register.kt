package com.example.l4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import java.lang.reflect.Member

class Employee(val id:String, val First:String, val Last:String){}
class Register : AppCompatActivity() {
    var auth:FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = FirebaseAuth.getInstance()
        if (auth!!.currentUser != null) {
            val it = Intent(this, Member::class.java)
            startActivity(it)
            finish()
        }

        registerregister.setOnClickListener {
            val First = nameregister.text.toString()
            val Lsat = lnameregister.text.toString()
            val email = emailregister.text.toString().trim()
            val pass = passwordregister.text.toString().trim()

            val fb = FirebaseDatabase.getInstance()
            val ref = fb.getReference("Employee")
            val id: String? = ref.push().key

            val employee = Employee(id.toString(), First, Lsat)

            if (First.isEmpty()) {
                Toast.makeText(this, "กรุณากรอก FirstName", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (Lsat.isEmpty()) {
                Toast.makeText(this, "กรุณากรอก LastName", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                Toast.makeText(this, "กรุณากรอก Email", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass.isEmpty()) {
                Toast.makeText(this, "กรุณากรอก Password", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }


            auth!!.createUserWithEmailAndPassword(email, pass).addOnCompleteListener { task ->
                if (!task.isSuccessful) {
                    if (pass.length < 6) {
                        passwordregister.error = "กรอกรหัสผ่านให้มากกว่า 6 ตัวอักษร"
                    } else {
                        emailregister.setText("")
                        passwordregister.setText("")
                        Toast.makeText(
                            this,
                            "Login ล้มเหลว เนื่องจาก : " + task.exception!!.message,
                            Toast.LENGTH_LONG

                        ).show()
                    }
                } else {
                    ref.child(id.toString()).setValue(employee).addOnCompleteListener {
                        nameregister.setText("")
                        lnameregister.setText("")
                        Toast.makeText(this, "Login Success!", Toast.LENGTH_LONG).show()
                        val it = Intent(this, Main::class.java)
                        startActivity(it)
                        finish()
                    }

                }

            }

        }
        backregister.setOnClickListener {
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }
    }
}