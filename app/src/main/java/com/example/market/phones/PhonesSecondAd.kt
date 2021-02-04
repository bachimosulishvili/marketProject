package com.example.market.phones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_phones_second_ad.*

class PhonesSecondAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phones_second_ad)

        Glide.with(this)
            .load("https://cdn.tmobile.com/content/dam/t-mobile/en-p/cell-phones/apple/Apple-iPhone-12-Pro-Max/Pacific-Blue/Apple-iPhone-12-Pro-Max-Pacific-Blue-frontimage.png")
            .into(phoneSecondAdThumbnail)
    }
}