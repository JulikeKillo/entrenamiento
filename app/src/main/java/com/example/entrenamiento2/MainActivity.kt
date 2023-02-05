package com.example.entrenamiento2

import android.annotation.SuppressLint
import com.example.entrenamiento2.DataClass;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.entrenamiento2.adapter.DataClassAdapter
import com.example.entrenamiento2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
 override fun onCreate(savedInstanceState: Bundle?){
     super.onCreate(savedInstanceState)
     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)
     DataClassProvider.superheroeLista
     initRecycler()

 }
 fun initRecycler(){
     binding.recyclerView.layoutManager = LinearLayoutManager(this)
     binding.recyclerView.adapter = DataClassAdapter(DataClassProvider.superheroeLista)
 }

}