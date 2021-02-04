package com.example.market.others

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_others_second_ad.*

class OthersSecondAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_others_second_ad)

        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0203/19732378_1.jpg?v=1")
            .into(othersSecondAdThumbnail)
    }
}