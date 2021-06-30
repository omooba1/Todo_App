package com.iyoboyi.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iyoboyi.myapplication.adapters.CountryAdapter
import com.iyoboyi.myapplication.databinding.ActivityRecyclerViewBinding
import com.iyoboyi.myapplication.models.Country

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding
    private lateinit var myCountryAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countries: List<Country> = listOf(
            Country(
                R.drawable.ic_brazil,
                "Brazil",
                "South America",
                12L
            ),

            Country(
                R.drawable.ic_china,
                "China",
                "Asia",
                15L
            ),

            Country(
                R.drawable.ic_usa,
                "United State of Ameria",
                "North Ameria",
                11L
            ),

            Country(
                R.drawable.ic_nigeria,
                "Nigeria",
                "Africa",
                10L
            ),

            Country(
                R.drawable.ic_uk,
                "United Kingdom",
                "Europe",
                16L
            )
        )

        myCountryAdapter = CountryAdapter(countries)

        binding.countryRecyclerView.adapter = myCountryAdapter
    }
}