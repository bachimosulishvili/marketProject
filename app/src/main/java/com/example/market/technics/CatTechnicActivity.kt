package com.example.market.technics

import android.content.Intent
import com.bumptech.glide.Glide
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.market.R
import kotlinx.android.synthetic.main.activity_cat_technic.*

class CatTechnicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_technic)
        init()
    }

    private fun init(){

        firstAd()
        secondAd()

        Glide.with(this)
            .load("https://photos5.appleinsider.com/gallery/35753-65877-13-inch-MacbOok-Pro-Front-Angle-xl.jpg")
            .into(technicsActivityFirstImageButton)

        Glide.with(this)
            .load("https://images.macrumors.com/t/-8Y1OTNw1PjLIQ6N6Hlso28a1Y4=/400x0/filters:quality(90)/article-new/2013/09/macbook_air_2015_elcap_roundup_header-800x459.jpg?lossy")
            .into(technicsActivitySecondImageButton)
    }

    private fun firstAd(){
        technicsActivityFirstButton.setOnClickListener(){
            startActivity(Intent(this, TechnicFirstAd::class.java))
        }
        technicsActivityFirstImageButton.setOnClickListener(){
            startActivity(Intent(this, TechnicFirstAd::class.java))
        }


    }
    private fun secondAd() {
        technicsActivitySecondButton.setOnClickListener(){
            startActivity(Intent(this, TechnicSecondAd::class.java))
        }
        technicsActivitySecondImageButton.setOnClickListener(){
            startActivity(Intent(this, TechnicSecondAd::class.java))
        }
    }

}