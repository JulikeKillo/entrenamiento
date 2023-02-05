package com.example.entrenamiento2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.entrenamiento2.DataClass
import com.example.entrenamiento2.R

class DataClassAdapter(private val superLista:List<DataClass>) : RecyclerView.Adapter<DataClassViewHoldder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataClassViewHoldder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  DataClassViewHoldder(layoutInflater.inflate(R.layout.item_data, parent, false))
    }
    override fun onBindViewHolder(holder: DataClassViewHoldder, position: Int) {
        val item = superLista[position]
        holder.render(item)
    }
    override fun getItemCount(): Int = superLista.size



}