package com.example.techtrain.railway.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


import com.example.techtrain.railway.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textview.text = getString(R.string.text)
//        findViewById<TextView>(R.id.text).text = "Hello!"
    }
}
