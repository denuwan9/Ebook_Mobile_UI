package com.example.application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.logging.Handler

class MainActivity : ComponentActivity() {

    // Variables
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set fullscreen flags
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Set the layout
        setContentView(R.layout.activity_splashscreen)

        // Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        // Hooks
        val image = findViewById<ImageView>(R.id.logo001) // Corrected ID reference
        val logo = findViewById<TextView>(R.id.textView7) // Corrected ID reference
        val slogan = findViewById<TextView>(R.id.textView6) // Corrected ID reference

        // Apply animations
        image.startAnimation(topAnim) // Use startAnimation instead of animation
        logo.startAnimation(bottomAnim)
        slogan.startAnimation(bottomAnim)

        // Delay the transition to the sign-up screen
        android.os.Handler().postDelayed({
            // Start the LoginActivity
            val intent = Intent(this, Onboard::class.java)
            startActivity(intent)
            finish() // Close the splash screen activity
        }, 3000) // 3000 milliseconds (3 seconds) delay


    }
}