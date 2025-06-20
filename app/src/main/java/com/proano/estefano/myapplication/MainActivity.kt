package com.proano.estefano.myapplication


import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.net.toUri

const val TAG_LOG = "com.proano.estefano.lifecycleactivity.LOG"


class MainActivity : AppCompatActivity() {
    lateinit var BtOtherDisplay: Button
    lateinit var BtToEpn: Button
    lateinit var BtGoogleMapsEpn: Button
    lateinit var BtCall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Call initializeViews to link UI elements after setContentView
        initializeViews()

        val message = "Estoy en onCreate"
        Log.d(TAG_LOG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        BtOtherDisplay.setOnClickListener {
            // Corrected syntax for starting a new activity
            // Make sure MainActivity2 exists in your project
            startActivity(Intent(this, MainActivity2::class.java))
        }

        BtToEpn.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, "https://www.epn.edu.ec".toUri()))
        }

        BtGoogleMapsEpn.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, "geo:-0.21,-78.49".toUri()))
        }

        BtCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, "tel:0992522055".toUri()))
        }
    }

    private fun initializeViews() {
        BtOtherDisplay = findViewById(R.id.BtOtherDisplay)
        BtToEpn = findViewById(R.id.BtToEpn)
        BtGoogleMapsEpn = findViewById(R.id.BtGoogleMapsEpn) // Corrected assignment
        BtCall = findViewById(R.id.BtCall) // Corrected assignment
    }

    override fun onStart() {
        super.onStart()
        val message = "Estoy en onStart"
        Log.d(TAG_LOG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        val message = "Estoy en onResume"
        Log.d(TAG_LOG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        val message = "Estoy en onRestart"
        Log.d(TAG_LOG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        val message = "Estoy en onPause"
        Log.d(TAG_LOG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val message = "Estoy en onDestroy"
        Log.d(TAG_LOG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        val message = "Estoy en onStop"
        Log.d(TAG_LOG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
