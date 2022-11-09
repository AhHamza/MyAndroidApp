package com.example.welcometofisrtapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
var email_inHome =""
class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (intent.getStringExtra("email") != null) {
                    /*PROBLEM HERE*/
            email_inHome = intent.getStringExtra("email")!! // DOESNT RETURN ANYTHING
        }
        val emailPrinted = findViewById<TextView>(R.id.txt_modified)
        emailPrinted.text = "email is : "+ email_inHome
    }
    }
