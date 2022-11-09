package com.example.welcometofisrtapp2

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Activity.RESULT_OK
import android.app.appsearch.AppSearchResult.RESULT_OK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.provider.FontsContractCompat.FontRequestCallback.RESULT_OK

val signUpAct_requestCode = 0
var email_inMain = ""
var usernameInMain = ""
var passwordInMain = ""


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //R -> resources folder

        var signupBtn = findViewById<Button>(R.id.btn_signup)
        signupBtn.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivityForResult(intent, signUpAct_requestCode)

        }

        var loginBtn = findViewById<Button>(R.id.btn_login)
        loginBtn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            intent.putExtra("email", email_inMain)
            intent.putExtra("password", passwordInMain)
            intent.putExtra("username", usernameInMain)
            startActivity(intent)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            if (requestCode == signUpAct_requestCode)
                if (resultCode == Activity.RESULT_OK)
                    if (
                        (data.getStringExtra("email") != null) &&
                        (data.getStringExtra("username") != null) &&
                        (data.getStringExtra("password") != null)
                    ) {
                        email_inMain = data.getStringExtra("email")!!
                        passwordInMain = data.getStringExtra("password")!!
                        usernameInMain = data.getStringExtra("username")!!
                    }
        }

    }
}