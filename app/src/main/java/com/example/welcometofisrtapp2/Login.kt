package com.example.welcometofisrtapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameFromMain = intent.getStringExtra("username")!!
        val emailFromMain = intent.getStringExtra("email")!!
        val passwordFromMain = intent.getStringExtra("password")!!

        val signInButton = findViewById<Button>(R.id.btn_signin)

                /*PROBLEM HERE !*/
        val emailFromLogin = findViewById<EditText>(R.id.txt_email_signin).text.toString()  //DOESNT RETURN ANYTHING
        val passwordFromLogin = findViewById<EditText>(R.id.txt_password_signin).text.toString() //DOESNT RETURN ANYTHING

        signInButton.setOnClickListener {
            intent = Intent(this,HomeActivity::class.java)
            if (emailFromMain == emailFromLogin && passwordFromLogin == passwordFromMain) {
                intent.putExtra("username", usernameFromMain)
                startActivity(intent)
            }

        }

    }
}