package com.iyoboyi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {


    private lateinit var userNameDisplay: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        userNameDisplay = findViewById(R.id.userNameDisplay)

        userNameDisplay.text = "This is the Home Page"
    }
}