package com.example.market.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_profile_second_ad.*

class ProfileSecondAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_second_ad)

        Glide.with(this)
            .load("https://m.media-amazon.com/images/I/61HFJwSDQ4L._AC_SY355_.jpg")
            .into(profileSecondThumbnail)
    }
}