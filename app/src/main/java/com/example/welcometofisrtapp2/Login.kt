package com.example.welcometofisrtapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameFromMain = intent.getStringExtra("username")!!
        val emailFromMain = intent.getStringExtra("email")!!
        val passwordFromMain = intent.getStringExtra("password")!!

        val signInButton = findViewById<Button>(R.id.btn_signin)

//                /*PROBLEM HERE !*/
//        val emailFromLogin = findViewById<EditText>(R.id.txt_email_signin).text.toString()  //DOESNT RETURN ANYTHING
//        val passwordFromLogin = findViewById<EditText>(R.id.txt_password_signin).text.toString()//DOESNT RETURN ANYTHING

        /*********************/
        // Here we get the edit text view by their IDs, then we will use their values when the button is pressed
        val emailFromLogin = findViewById<EditText>(R.id.txt_email_signin)
        val passwordFromLogin = findViewById<EditText>(R.id.txt_password_signin)

        signInButton.setOnClickListener {
            /*********************/
            //Using the values held in the edit text views
            val email: String = emailFromLogin.text.toString()
            val password: String = passwordFromLogin.text.toString()
            //intent = Intent(this,HomeActivity::class.java)

            /*********************/
            // Initialized a new Intent(infoIntent) instead of using the received Intent(intent)
            val infoIntent: Intent = Intent(this, HomeActivity::class.java)
            if (emailFromMain == email && password == passwordFromMain) {
                infoIntent.putExtra("username", usernameFromMain)
                startActivity(infoIntent)
            }
        }
    }
}