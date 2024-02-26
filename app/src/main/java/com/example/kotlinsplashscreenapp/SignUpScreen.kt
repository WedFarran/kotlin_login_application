package com.example.kotlinsplashscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinsplashscreenapp.databinding.ActivityLoginScreenBinding
import com.example.kotlinsplashscreenapp.databinding.ActivitySignUpScreenBinding

class SignUpScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.textView6.setOnClickListener{
            var intent = Intent(this, login_screen::class.java)
            startActivity(intent)
            finish()
        }
        binding.btSignup.setOnClickListener{
            var intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}