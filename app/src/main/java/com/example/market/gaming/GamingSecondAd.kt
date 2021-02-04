package com.example.market.gaming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_gaming_second_ad.*

class GamingSecondAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaming_second_ad)

        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0108/19385219_2.jpg?v=7")
            .into(gamingSecondAdThumbnail)
    }
}