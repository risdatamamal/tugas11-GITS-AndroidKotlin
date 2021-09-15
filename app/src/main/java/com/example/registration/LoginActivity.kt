package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html.fromHtml
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var textViewCreateAccount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Login"
        initCreateAccountTextView()
    }

    private fun initCreateAccountTextView() {
        textViewCreateAccount = findViewById(R.id.textViewCreateAccount)
        textViewCreateAccount.text = fromHtml("<font color='#000000'>I don't have account yet. </font><font color='#0c0099'>Create One</font>")

        textViewCreateAccount.setOnClickListener {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}