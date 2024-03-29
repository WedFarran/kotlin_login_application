package com.example.kotlinsplashscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinsplashscreenapp.databinding.ActivityLoginScreenBinding
import com.example.kotlinsplashscreenapp.databinding.ActivityMainBinding

class login_screen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.tvMoveToSignUp.setOnClickListener{
            var intent = Intent(this, SignUpScreen::class.java)
            startActivity(intent)
            finish()
        }
        binding.btLogin.setOnClickListener{
            var intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}