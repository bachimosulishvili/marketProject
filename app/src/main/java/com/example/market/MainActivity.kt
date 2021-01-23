package com.example.market

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
private lateinit var auth: FirebaseAuth
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        }
    private fun init(){
        logIn()
        firstAd()
        secondAd()
        profile()
        onStart()
        signOut()
    }
    private fun logIn(){
        val intent0 = Intent(this, LogInActivity::class.java)
        mainActivityLoginButton.setOnClickListener() {
            startActivity(intent0)
        }
    }

    private fun firstAd(){
        val intent1 = Intent(this, MacbookActivity::class.java)

        mainActivityFirstAdButton.setOnClickListener() {
         startActivity(intent1)
     }
        mainActivityFirstAdImageButton.setOnClickListener(){
            startActivity(intent1)
        }
    }

    private fun secondAd() {
        val intent2 = Intent(this, IphoneActivity::class.java)

        mainActivitySecondAdButton.setOnClickListener(){
            startActivity(intent2)
        }
        mainActivitySecondAdImageButton.setOnClickListener() {
            startActivity(intent2)
        }
    }

    private fun profile(){
        val intent3 = Intent(this, MyProfileActivity::class.java)

        mainActivityProfileButton.setOnClickListener(){
            startActivity(intent3)
        }
    }

    private fun signOut() {

        mainActivityLogoutButton.setOnClickListener(){
            Firebase.auth.signOut()
            mainActivityLogoutButton.visibility = View.GONE
            mainActivityProfileButton.visibility = View.GONE
            mainActivityLoginButton.visibility = View.VISIBLE
        }

    }



    public override fun onStart() {
        super.onStart()
        auth = Firebase.auth

        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            mainActivityProfileButton.visibility = View.VISIBLE
            mainActivityLoginButton.visibility = View.GONE
            mainActivityLogoutButton.visibility = View.VISIBLE;
        }
    }

}