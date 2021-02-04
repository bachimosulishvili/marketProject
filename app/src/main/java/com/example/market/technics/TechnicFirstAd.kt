package com.example.market.technics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_technic_first_ad.*

class TechnicFirstAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technic_first_ad)

        Glide.with(this)
            .load("https://photos5.appleinsider.com/gallery/35753-65877-13-inch-MacbOok-Pro-Front-Angle-xl.jpg")
            .into(technicsFirstAdThumbnail)
    }
}