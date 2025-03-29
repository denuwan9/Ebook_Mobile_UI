package com.example.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import com.example.application.databinding.ActivityBottomnaviBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigation :AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomnavi)



        bottomNavigationView = findViewById(R.id.bottomNavigationView1)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->

            when (menuItem.itemId) {

                R.id.home -> {
                    replaceFragment(HomeF())
                    true
                }

                R.id.profile -> {
                    replaceFragment(Profile())
                    true
                }

                R.id.book -> {
                    replaceFragment(BookF())
                    true
                }

                else -> false
            }
        }
        replaceFragment(HomeF())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment) // Pass the fragment here
            .commit()
    }

}





