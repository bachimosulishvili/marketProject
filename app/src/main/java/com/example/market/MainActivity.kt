package com.example.market

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.market.gaming.CatGamingPcsActivity
import com.example.market.music.CatMusicActivity
import com.example.market.others.CatOthersActivity
import com.example.market.phones.CatPhonesActivity
import com.example.market.profile.MyProfileActivity
import com.example.market.technics.CatTechnicActivity
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
        profile()
        onStart()
        signOut()
        technics()
        music()
        phones()
        gaming()
        other()
    }
    private fun technics(){
        val intentTech = Intent(this, CatTechnicActivity::class.java)
        mainActivityTechnicsButton.setOnClickListener(){
            startActivity(intentTech)
        }

    }

    private fun music(){
        val intentMusic = Intent(this, CatMusicActivity::class.java)
        mainActivityMusicButton.setOnClickListener(){
            startActivity(intentMusic)
        }

    }

    private fun phones(){
        val intentPhones = Intent(this, CatPhonesActivity::class.java)
        mainActivityPhonesButton.setOnClickListener(){
            startActivity(intentPhones)
        }

    }

    private fun gaming(){
        val intentGaming = Intent(this, CatGamingPcsActivity::class.java)
        mainActivityGamingButton.setOnClickListener(){
            startActivity(intentGaming)
        }

    }

    private fun other(){
        val intentOther = Intent(this, CatOthersActivity::class.java)
        mainActivityOtherButton.setOnClickListener(){
            startActivity(intentOther)
        }

    }








    private fun logIn(){
        val intent0 = Intent(this, LogInActivity::class.java)
        mainActivityLoginButton.setOnClickListener() {
            startActivity(intent0)
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
        val currentUser = auth.currentUser
        if(currentUser != null){
            mainActivityProfileButton.visibility = View.VISIBLE
            mainActivityLoginButton.visibility = View.GONE
            mainActivityLogoutButton.visibility = View.VISIBLE;
        }
    }
}