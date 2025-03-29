package com.example.application

import android.annotation.SuppressLint
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

class Item : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_item)

        val buy_btn = findViewById<Button>(R.id.buy_btn)

        buy_btn.setOnClickListener {
            val intent = Intent(this, Order::class.java) // Fix typo here
            startActivity(intent) // Use the correct variable name
            // Remove finish() if you want to return to MainActivity later
        }
    }
}

