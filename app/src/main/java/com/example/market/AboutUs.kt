package com.example.market

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_about_us.*

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        init()

    }


    private fun init(){
        Glide.with(this)
            .load("https://scontent.ftbs5-2.fna.fbcdn.net/v/t1.15752-9/146553459_885588645527409_1949237136205497646_n.png?_nc_cat=109&ccb=2&_nc_sid=ae9488&_nc_ohc=pVhq7SbT7mUAX8h8tK8&_nc_ht=scontent.ftbs5-2.fna&oh=0dbc738bc54dfcf7e1e29a8b3b2dcf67&oe=60405D5F")
            .into(developer1ImageView)

        Glide.with(this)
            .load("https://scontent.ftbs5-1.fna.fbcdn.net/v/t1.0-9/74320664_527816164753501_7361117076787822592_o.jpg?_nc_cat=104&ccb=2&_nc_sid=174925&_nc_ohc=8b2XIRQqG-oAX9V4_kX&_nc_ht=scontent.ftbs5-1.fna&oh=e2e78a9a3f2bf2620e2c9c85cc4bdfe1&oe=603FF11A")
            .into(developer2ImageView)


    }
}