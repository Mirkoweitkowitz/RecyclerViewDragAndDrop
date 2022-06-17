package com.minwoo.recyclerviewdraganddrop

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    fun bind(mainItemModel: MainItemModel) {
        view.findViewById<TextView>(R.id.name).text = mainItemModel.name
    }
}