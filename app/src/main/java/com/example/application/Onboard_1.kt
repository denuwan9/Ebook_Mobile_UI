package com.example.application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.application.ui.theme.ApplicationTheme

class Onboard_1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)

        val next = findViewById<Button>(R.id.next)

        next.setOnClickListener {
            val intent = Intent(this, Onboard_2::class.java) // Fix typo here
            startActivity(intent) // Use the correct variable name
            // Remove finish() if you want to return to MainActivity later
        }
        val back = findViewById<Button>(R.id.back)

       back.setOnClickListener {
            val intent = Intent(this, Onboard::class.java) // Fix typo here
            startActivity(intent) // Use the correct variable name
            // Remove finish() if you want to return to MainActivity later
        }

    }
}

