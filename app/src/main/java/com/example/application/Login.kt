package com.example.application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.application.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Login Button Click
        binding.login1.setOnClickListener {
            startActivity(Intent(this, BottomNavigation::class.java))
        }

        // Signup Text Click
        binding.signup2.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }
    }



    private fun navigateToBottomNavigation() {
        val intent = Intent(this, BottomNavigation::class.java).apply {
            // Clear back stack so user can't go back to Login
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish() // Finish LoginActivity
    }
}