package com.iyoboyi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val username: String = "admin"
    val password: String = "admin"

    private lateinit var usernameInput: EditText
    private lateinit var passWordInput: EditText
    private lateinit var submitButton: Button






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}