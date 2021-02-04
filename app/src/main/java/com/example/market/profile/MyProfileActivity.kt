package com.example.market.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.Messages
import com.example.market.R
import kotlinx.android.synthetic.main.activity_my_profile.*

class MyProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        init()
    }

    private fun init(){
        firstAd()
        secondAd()
        messages()

        Glide.with(this)
            .load("https://www.compuworx.co.za/wp-content//uploads/2019/04/hp-nb-250-g7-pic2.jpg")
            .into(profileFirstImageButton)

        Glide.with(this)
            .load("https://m.media-amazon.com/images/I/61HFJwSDQ4L._AC_SY355_.jpg")
            .into(profileSecondImageButton)
    }

    private fun firstAd(){
        profileFirstImageButton.setOnClickListener(){
            startActivity(Intent(this, ProfileFirstAd::class.java))
        }

    }
    private fun secondAd(){
        profileSecondImageButton.setOnClickListener(){
            startActivity(Intent(this, ProfileSecondAd::class.java))
        }
    }

    private fun messages(){
        profileMessagesButton.setOnClickListener(){
            startActivity(Intent(this, Messages::class.java))
        }
    }
}