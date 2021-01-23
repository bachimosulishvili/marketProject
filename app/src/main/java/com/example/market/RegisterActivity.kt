package com.example.market

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_register.*
import javax.security.auth.login.LoginException

class RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        init()
    }

    private fun init() {
        register()
    }

    private fun register() {
        registrationLayoutRegisterButton.setOnClickListener() {
            auth = Firebase.auth
            val email = registrationLayoutEmailEditText.text.toString()
            val password = registrationLayoutPasswordEditText.text.toString()
            val repeatPassword = registrationLayoutRepeatPasswordEditText.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty() && repeatPassword.isNotEmpty()) {
                if (password == repeatPassword) {
                    auth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(this) { task ->
                                if (task.isSuccessful) {
                                    Log.d("TAG", "createUserWithEmail:success")
                                    val user = auth.currentUser
                                    UpdateUI()
                                } else {
                                    Log.w("TAG", "createUserWithEmail:failure", task.exception)
                                    Toast.makeText(baseContext, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show()
                                }
                            }
                }
            }
        }
    }

    private fun UpdateUI() {
        val intent = Intent(this, LogInActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }
}