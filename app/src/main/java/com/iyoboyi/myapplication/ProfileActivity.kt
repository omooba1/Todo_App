package com.iyoboyi.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iyoboyi.myapplication.databinding.ActivityProfileBinding
import com.iyoboyi.myapplication.databinding.ActivityRecyclerViewBinding
import android.content.Intent as Intent1

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.homeButton.setOnClickListener {
            val intent = Intent1(this,HomeActivity::class.java)
            startActivity(intent)
        }

        binding.countryButton.setOnClickListener {
            val intent = Intent1(this,RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }

}