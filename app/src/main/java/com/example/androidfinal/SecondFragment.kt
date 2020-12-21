package com.example.androidfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.category_item.view.*
import kotlinx.android.synthetic.main.country_item.view.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)

        val categoryList = ArrayList<Category>()
        for(i in 1 .. 7){
            categoryList.add(Category("business"))
            categoryList.add(Category("entertainment"))
            categoryList.add(Category("general"))
            categoryList.add(Category("health"))
            categoryList.add(Category("science"))
            categoryList.add(Category("sports"))
            categoryList.add(Category("technology"))
        }

        val adapter = CategoryAdapter()
        val recyclerView = view.categoryItem
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return view
    }

}