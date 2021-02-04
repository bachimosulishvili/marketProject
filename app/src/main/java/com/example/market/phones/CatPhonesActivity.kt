package com.example.market.phones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import com.example.market.technics.TechnicFirstAd
import kotlinx.android.synthetic.main.activity_cat_phones.*
import kotlinx.android.synthetic.main.activity_cat_technic.*

class CatPhonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_phones)
        init()
    }

    private fun init() {

        firstAd()
        secondAd()

        Glide.with(this)
            .load("https://www.notebookcheck.biz/uploads/tx_nbc2/SamsungGalaxyS20Ultra__1_.JPG")
            .into(phonesActivityFirstImageButton)

        Glide.with(this)
            .load("https://cdn.tmobile.com/content/dam/t-mobile/en-p/cell-phones/apple/Apple-iPhone-12-Pro-Max/Pacific-Blue/Apple-iPhone-12-Pro-Max-Pacific-Blue-frontimage.png")
            .into(phonesActivitySecondImageButton)
    }

    private fun firstAd(){
        phonesActivityFirstButton.setOnClickListener(){
            startActivity(Intent(this, PhonesFirstAd::class.java))
        }
        phonesActivityFirstImageButton.setOnClickListener(){
            startActivity(Intent(this, PhonesFirstAd::class.java))
        }
    }
    private fun secondAd(){
        phonesActivitySecondButton.setOnClickListener(){
            startActivity(Intent(this, PhonesSecondAd::class.java))
        }
        phonesActivitySecondImageButton.setOnClickListener(){
            startActivity(Intent(this, PhonesSecondAd::class.java))
        }
    }
}