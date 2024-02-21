package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var buyBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buyBtn = findViewById(R.id.buyBtn)
        buyBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, BuyActivity::class.java)
            startActivity(intent)
        }
    }
}