package com.bitc.plumMarket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitc.plumMarket.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}