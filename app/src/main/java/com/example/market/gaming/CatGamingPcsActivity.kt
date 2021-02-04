package com.example.market.gaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_cat_gaming_pcs.*
import kotlinx.android.synthetic.main.activity_cat_technic.*

class CatGamingPcsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_gaming_pcs)
        init()
    }
    private fun init(){
        firstAd()
        secondAd()

        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0130/19679938_1.jpg?v=2")
            .into(gamingActivityFirstImageButton)

        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0108/19385219_2.jpg?v=7")
            .into(gamingActivitySecondImageButton)
    }




    private fun firstAd(){
        val intent1 = Intent(this, GamingFirstAd::class.java)
        gamingActivityFirstButton.setOnClickListener() {
            startActivity(intent1)
        }
        gamingActivityFirstImageButton.setOnClickListener(){
            startActivity(intent1)
        }
    }

    private fun secondAd() {
        val intent2 = Intent(this, GamingSecondAd::class.java)

        gamingActivitySecondButton.setOnClickListener(){
            startActivity(intent2)
        }
        gamingActivitySecondImageButton.setOnClickListener() {
            startActivity(intent2)
        }
    }

}