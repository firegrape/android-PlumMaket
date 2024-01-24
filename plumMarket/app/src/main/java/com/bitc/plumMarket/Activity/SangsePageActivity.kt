package com.bitc.plumMarket.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitc.plumMarket.R
import com.bitc.plumMarket.databinding.ActivitySangsePageBinding


class SangsePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySangsePageBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnBack.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


        binding.btnHome.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        binding.btnChatting.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
//          점점점 아이콘 이동 경로 미정
        binding.jumjumjum.setOnClickListener {
            intent = Intent(this, GesigeulPageActivity::class.java)
            startActivity(intent)
        }

    }
}