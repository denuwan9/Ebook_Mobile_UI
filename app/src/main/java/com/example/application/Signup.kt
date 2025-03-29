package com.example.application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class Signup : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signup = findViewById<Button>(R.id.signup1)

        signup.setOnClickListener {
            val intent = Intent(this, Login::class.java) // Fix typo here
            startActivity(intent) // Use the correct variable name
            // Remove finish() if you want to return to MainActivity later
        }

        val login2 = findViewById<TextView>(R.id.login2)

        login2.setOnClickListener {
            val intent = Intent(this, Login::class.java) // Fix typo here
            startActivity(intent) // Use the correct variable name
            // Remove finish() if you want to return to MainActivity later
        }



    }
}

