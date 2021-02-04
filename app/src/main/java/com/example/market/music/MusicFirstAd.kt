package com.example.market.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_music_first_ad.*

class MusicFirstAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_first_ad)

        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0128/19658846_1.jpg?v=1")
            .into(musicFirstAdThumbnail)
    }
}