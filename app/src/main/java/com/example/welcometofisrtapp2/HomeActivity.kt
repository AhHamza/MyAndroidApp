package com.example.welcometofisrtapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//var email_inHome =""
class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        /*********************/
        // You must find text view by id (txt_modified), then you should update it's value.
        val greetingText: TextView = findViewById(R.id.txt_modified)

        /*********************/
        //saving intent.getStringExtra in a variable to avoid invoking the method multiple times
        val userName: String = intent.getStringExtra("username") as String

        /*********************/
        /* update the text view to show the username*/
        greetingText.text = userName

//        if (userName != null) {
//                    /*PROBLEM HERE*/
////            email_inHome = intent.getStringExtra("email")!! // DOESNT RETURN ANYTHING
                /************************************************************/
                /*EDIT: the previous line didn't return anything because the key is "username" not "email"*/
//
//
//
//        }
//        val emailPrinted = findViewById<TextView>(R.id.txt_modified)
//        emailPrinted.text = "email is : "+ email_inHome
    }
}
