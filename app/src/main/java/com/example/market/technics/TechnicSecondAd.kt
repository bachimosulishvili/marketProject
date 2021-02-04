package com.example.market.technics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_technic_first_ad.*

class TechnicSecondAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technic_second_ad)

        Glide.with(this)
            .load("https://images.macrumors.com/t/-8Y1OTNw1PjLIQ6N6Hlso28a1Y4=/400x0/filters:quality(90)/article-new/2013/09/macbook_air_2015_elcap_roundup_header-800x459.jpg?lossy")
            .into(technicsFirstAdThumbnail)
    }
}