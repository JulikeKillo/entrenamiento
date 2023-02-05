package com.example.entrenamiento2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.entrenamiento2.DataClass
import com.example.entrenamiento2.R
import com.example.entrenamiento2.databinding.ItemDataBinding

class DataClassViewHoldder(view: View):ViewHolder(view) {

    val binding = ItemDataBinding.bind(view)



    fun render(dataClass: DataClass){

        binding.tvNgoloNombre.text=dataClass.superhero
        binding.tvNgoloNombreReal.text=dataClass.nombre
        binding.tvNacion.text=dataClass.publicador
        Glide.with(binding.ivNgolo.context).load(dataClass.foto).into(binding.ivNgolo)
    }
}