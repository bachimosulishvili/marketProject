package com.example.market

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_messages.*

class Messages : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)
        init()

    }

private fun init(){

    sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)

    val subject = sharedPreferences.getString("subject", "")
    val message = sharedPreferences.getString("message", "")

    messagesSubject.setText(subject)
    messagesMessage.setText(message)

    }
}