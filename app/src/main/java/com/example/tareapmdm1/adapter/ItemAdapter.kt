package com.example.tareapmdm1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tareapmdm1.R


class ItemAdapter(val items: List<Item>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.layout_item, parent, false)
        return ViewHolder(view)

    }
    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nemonico = view.findViewById<TextView>(R.id.txtNemonico)
        private val nombre = view.findViewById<TextView>(R.id.txtNombre)
        private val capacidad = view.findViewById<TextView>(R.id.txtCapacidad)
        fun bind(item: Item) {
            nemonico.text = item.nemo
            nombre.text = item.name
            capacidad.text = item.star.toString()
        }
    }
}