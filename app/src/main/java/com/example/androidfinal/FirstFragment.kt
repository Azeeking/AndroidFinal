package com.example.androidfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.country_item.view.*

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val countryList = ArrayList<Country>()
        for(i in 1 .. 7){
            countryList.add(Country("India"))
            countryList.add(Country("USA"))
            countryList.add(Country("Australia"))
            countryList.add(Country("Russia"))
            countryList.add(Country("France"))
            countryList.add(Country("United Kingdom"))
        }

        val adapter = CountryAdapter()
        val recyclerView = view.countryItem
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())


        return view
    }

}