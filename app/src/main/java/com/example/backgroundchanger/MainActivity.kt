package com.example.backgroundchanger

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.backgroundchanger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonSetBackground.setOnClickListener { changeLayoutBakground() }
        binding.imageButtonLogo.setOnClickListener {changeImageBackground() }
    }

    private fun changeImageBackground() {
        binding.imageButtonLogo.setBackgroundColor(Color.rgb(getRandomValue(), getRandomValue(), getRandomValue()))
    }

    private fun changeLayoutBakground() {
        binding.layout.setBackgroundColor(Color.rgb(getRandomValue(), getRandomValue(), getRandomValue()))
    }

    private fun getRandomValue(): Int {
        return (100..200).random()
    }
}