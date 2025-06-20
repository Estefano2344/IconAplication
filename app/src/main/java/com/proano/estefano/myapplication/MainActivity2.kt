package com.proano.estefano.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var BtToPantallaInicio: Button
    lateinit var BtToPantalla3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Call initializeViews to link UI elements after setContentView
        initializeViews()

        BtToPantallaInicio.setOnClickListener {
            // Corrected syntax for starting a new activity
            // Make sure MainActivity2 exists in your project
            startActivity(Intent(this, MainActivity::class.java))
        }

        BtToPantalla3.setOnClickListener {
            // Corrected syntax for starting a new activity
            // Make sure MainActivity2 exists in your project
            startActivity(Intent(this, MainActivity3::class.java))
            //finish()
        }

    }
    private fun initializeViews() {
        BtToPantallaInicio = findViewById(R.id.BtToPantallaInicio)
        BtToPantalla3 = findViewById(R.id.BtToPantalla3)
    }
}