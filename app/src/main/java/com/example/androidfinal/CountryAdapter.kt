package com.example.androidfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.country_item.view.*

class CountryAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var countryList = emptyList<Country>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as MyViewHolder
        val currentItem = countryList[position]
        holder.itemView.nameCountry.text = currentItem.name

        holder.itemView.countryItem.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}