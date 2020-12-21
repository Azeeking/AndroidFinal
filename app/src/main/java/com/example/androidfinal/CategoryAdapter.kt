package com.example.androidfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category_item.view.*
import kotlinx.android.synthetic.main.country_item.view.*

class CategoryAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>()  {

    private var categoryList = emptyList<Category>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as CountryAdapter.MyViewHolder
        val currentItem = categoryList[position]
        holder.itemView.categoryName.text = currentItem.name

        holder.itemView.countryItem.setOnClickListener{
            NavHostFragment.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}