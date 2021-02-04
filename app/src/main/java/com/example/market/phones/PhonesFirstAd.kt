package com.example.market.phones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_phones_first_ad.*

class PhonesFirstAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phones_first_ad)

        Glide.with(this)
            .load("https://www.notebookcheck.biz/uploads/tx_nbc2/SamsungGalaxyS20Ultra__1_.JPG")
            .into(phoneFirstAdThumbnail)
    }
}