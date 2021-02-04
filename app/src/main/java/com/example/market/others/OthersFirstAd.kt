package com.example.market.others

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_others_first_ad.*

class OthersFirstAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_others_first_ad)

        Glide.with(this)
            .load("https://ae01.alicdn.com/kf/HTB1kb8LXK6sK1RjSsrbq6xbDXXa9/TRINX-20-Speed-Mountain-Bike-26-Air-Fork-Carbon-Fiber-MTB-Bike-Light-Weight-Bicycle-Deore.jpg")
            .into(othersFirstAdThumbnail)
    }
}