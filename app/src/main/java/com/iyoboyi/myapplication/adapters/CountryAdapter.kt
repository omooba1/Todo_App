package com.iyoboyi.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iyoboyi.myapplication.databinding.CountryItemBinding
import com.iyoboyi.myapplication.models.Country

class CountryAdapter(val countries: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(var binding: CountryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(country: Country) {
            binding.countryContinent.text = country.continent
            binding.countryName.text = country.name
            binding.countryPopulation.text = country.population.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var binding = CountryItemBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.bind(country)
    }

    override fun getItemCount(): Int {
        return countries.size
    }
}