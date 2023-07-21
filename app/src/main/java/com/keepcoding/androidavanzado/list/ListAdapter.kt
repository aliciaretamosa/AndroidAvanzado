package com.keepcoding.androidavanzado.list

import android.R
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.keepcoding.androidavanzado.databinding.ItemHeroBinding


class ListAdapter: RecyclerView.Adapter<ListAdapter.HeroViewHolder>() {

    private var list = mutableListOf<String>()

    class HeroViewHolder(val binding: ItemHeroBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (hero: String) {
            with (binding) {
               tvName.setText(hero)
            }
        }
    }

    override fun getItemCount(): Int = list.size //funcion in line


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val binding = ItemHeroBinding.inflate( //propiedad de las activities, sirve para transformar un xml para usarlo en kotlin
            LayoutInflater.from(parent.context), parent, false)
        return HeroViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) { //rellenar uno de los elementos
            holder.bind(list[position])
    }

    fun submit(listHero: List<String>) {
        list = listHero.toMutableList()
        notifyDataSetChanged() //actualizar el recycler view
    }

    fun borrarTodo() {
        list.clear()
        notifyDataSetChanged()
    }



}