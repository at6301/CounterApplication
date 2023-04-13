package com.example.counterapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var count: counter
    private lateinit var countButton: Button
    private var displayCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = counter()
        displayCount = findViewById(R.id.counterTextView)
        countButton = findViewById(R.id.tapButton)

        countButton.setOnClickListener{
            count!!.addCount()

            displayCount?.setText(count.getCount().toString())
        }

    }
}