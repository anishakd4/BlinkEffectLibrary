package com.anishdubey.blinkeffectexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.anishdubey.blinklibrary.BlinkEffect

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.buttonView)
        btn.setOnClickListener {
            // use of blink-library
            BlinkEffect.blink(btn)
        }
    }
}