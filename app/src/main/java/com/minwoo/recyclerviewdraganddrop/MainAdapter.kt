package com.minwoo.recyclerviewdraganddrop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter: RecyclerView.Adapter<MainViewHolder>() {

    private val itemList = arrayListOf<MainItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setItemList(itemList: ArrayList<MainItemModel>) {
        itemList.addAll(itemList)
        notifyDataSetChanged()
    }
}