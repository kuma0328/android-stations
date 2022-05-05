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
        val view = binding.root
        setContentView(view)
        binding.textview.text = getString(R.string.textview)
//        findViewById<TextView>(R.id.text).text = "Hello!"
    }
}
