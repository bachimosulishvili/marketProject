package com.example.market.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_my_profile.*
import kotlinx.android.synthetic.main.activity_profile_first_ad.*

class ProfileFirstAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_first_ad)

        Glide.with(this)
            .load("https://www.compuworx.co.za/wp-content//uploads/2019/04/hp-nb-250-g7-pic2.jpg")
            .into(profileFirstThumbnail)
    }
}