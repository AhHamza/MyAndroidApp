package com.example.welcometofisrtapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sign_up)

        val email = findViewById<EditText>(R.id.txt_email)
        val password = findViewById<EditText>(R.id.txt_password)
        val username = findViewById<EditText>(R.id.txt_username)
        val button: Button = findViewById(R.id.btn_register)
        button.setOnClickListener {
            var returnIntent = Intent()
            returnIntent.putExtra("email", email.text.toString())
            returnIntent.putExtra("password", password.text.toString())
            returnIntent.putExtra("username", username.text.toString())
            setResult(RESULT_OK, returnIntent)
            finish()
        }


    }
}