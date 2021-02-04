package com.example.market.music

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_cat_music.*
import kotlinx.android.synthetic.main.activity_cat_technic.*

class CatMusicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_music)
        init()
    }

    private fun init(){
        firstAd()
        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0128/19658846_1.jpg?v=1")
            .into(musicActivityFirstImageButton)
    }




    private fun firstAd(){
        val intent1 = Intent(this, MusicFirstAd::class.java)
        musicActivityFirstButton.setOnClickListener() {
            startActivity(intent1)
        }
        musicActivityFirstImageButton.setOnClickListener(){
            startActivity(intent1)
        }
    }

}