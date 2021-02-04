package com.example.market

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.activity_main.*
import android.content.SharedPreferences as SharedPreferences

private lateinit var auth: FirebaseAuth

class LogInActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        init()
        }

    private fun init() {
        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        register()
        logIn()
    }

    private fun register() {
        val intent0 = Intent(this, RegisterActivity::class.java)
        logInLayoutRegisterButton.setOnClickListener {
            startActivity(intent0)
        }
    }

    private fun logIn() {
        logInLayoutLogInButton.setOnClickListener {
            auth = Firebase.auth
            val email = logInLayoutEmailEditText.text.toString()
            val password = logInLayoutPasswordEditText.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {

                val editor = sharedPreferences.edit()
                editor.putString("email", email)
                editor.apply()

                auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                Log.d("TAG", "signInWithEmail:success")
                                val user = auth.currentUser
                                updateUI()
                            } else {
                                Log.w("TAG", "signInWithEmail:failure", task.exception)
                                Toast.makeText(baseContext, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show()
                            }
                        }
            }
        }
    }

    private fun updateUI() {
        val intent1 = Intent(this, MainActivity::class.java)
        intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent1)
    }
}
