package com.minwoo.recyclerviewdraganddrop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvTab)
        val mainAdapter = MainAdapter()
        val itemList = arrayListOf<MainItemModel>()

        itemList.add(MainItemModel("개발자"))
        itemList.add(MainItemModel("어려운"))
        itemList.add(MainItemModel("리사이클러뷰"))
        mainAdapter.setItemList(itemList)

        recyclerView.adapter = mainAdapter
    }
}