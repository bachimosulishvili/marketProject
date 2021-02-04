package com.example.market

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contact.*


class Contact : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        init()
    }
    private fun init() {
        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)

        val email = sharedPreferences.getString("email", "")
        contactMailTextView.setText(email)

        contactSendButton.setOnClickListener() {

            val subject = subjectEditText.text.toString()
            val message = messageEditText.text.toString()

            if (subject.isNotEmpty() && message.isNotEmpty()) {

                val editor = sharedPreferences.edit()

                editor.putString("subject", subject)
                editor.putString("message", message)
                editor.apply()

                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
                Toast.makeText(baseContext, "Message Sent. Thank you for your feedback!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}