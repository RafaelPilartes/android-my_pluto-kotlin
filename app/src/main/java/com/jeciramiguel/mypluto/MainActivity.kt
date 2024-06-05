package com.jeciramiguel.mypluto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference the start button from the layout
        val startButton: Button = findViewById<Button>(R.id.startButton)

        // Set a click listener on the start button
        startButton.setOnClickListener {
            // Create an Intent to start the GameActivity
            val intent = Intent(this, GameActivity::class.java)
            // Start the GameActivity
            startActivity(intent)
        }
    }
}