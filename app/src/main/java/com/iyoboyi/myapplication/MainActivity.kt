package com.iyoboyi.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val validUsername: String = "admin"
    val validPassword: String = "admin"

    //Layout variables
    private lateinit var userNameInput: EditText
    private lateinit var passWordInput: EditText
    private lateinit var submitButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userNameInput = findViewById(R.id.userNameInput)
        passWordInput = findViewById(R.id.passWordInput)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val username = userNameInput.text.toString()
            val password = passWordInput.text.toString()

            logIn(username, password)
        }

    }

    fun logIn(userName: String, passWord: String) {
        if (isValidCredentials(userName, passWord)) {
            val intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", userName)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "Username or Password Incorrect", Toast.LENGTH_SHORT)
                .show()
        }

    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        if (password == validPassword) return true
        return false

    }

}