package com.example.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.insurance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //TODO 2: Create an instance of view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO 3: Initialize the view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}