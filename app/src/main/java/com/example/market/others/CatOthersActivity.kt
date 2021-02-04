package com.example.market.others

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.market.R
import kotlinx.android.synthetic.main.activity_cat_others.*
import kotlinx.android.synthetic.main.activity_cat_technic.*

class CatOthersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_others)
        init()
    }
    private fun init(){
        firstAd()
        secondAd()

        Glide.with(this)
            .load("https://ae01.alicdn.com/kf/HTB1kb8LXK6sK1RjSsrbq6xbDXXa9/TRINX-20-Speed-Mountain-Bike-26-Air-Fork-Carbon-Fiber-MTB-Bike-Light-Weight-Bicycle-Deore.jpg")
            .into(othersActivityFirstImageButton)

        Glide.with(this)
            .load("https://static.my.ge/mymarket/photos/large/0203/19732378_1.jpg?v=1")
            .into(othersActivitySecondImageButton)
    }




    private fun firstAd(){
        val intent1 = Intent(this, OthersFirstAd::class.java)
        othersActivityFirstButton.setOnClickListener() {
            startActivity(intent1)
        }
        othersActivityFirstImageButton.setOnClickListener(){
            startActivity(intent1)
        }
    }

    private fun secondAd() {
        val intent2 = Intent(this, OthersSecondAd::class.java)

        othersActivitySecondButton.setOnClickListener(){
            startActivity(intent2)
        }
        othersActivitySecondImageButton.setOnClickListener() {
            startActivity(intent2)
        }
    }

}