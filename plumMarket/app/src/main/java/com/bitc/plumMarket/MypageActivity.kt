package com.bitc.plumMarket

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitc.plumMarket.databinding.ActivityMypageBinding

class MypageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMypageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGansim.setOnClickListener {
            intent = Intent(this, GansimActivity::class.java)
            startActivity(intent)
        }

        binding.btnPanmae.setOnClickListener {
            intent = Intent(this, PanmaeActivity::class.java)
            startActivity(intent)
        }

        binding.btnGumae.setOnClickListener {
            intent = Intent(this, GumaeActivity::class.java)
            startActivity(intent)
        }

        binding.profilePicture.setOnClickListener {
            intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.btnMypageProfile.setOnClickListener {
            intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}