package com.example.market.gaming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_gaming_first_ad.*

class GamingFirstAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaming_first_ad)

        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0130/19679938_1.jpg?v=2")
            .into(gamingFirstAdThumbnail)
    }
}