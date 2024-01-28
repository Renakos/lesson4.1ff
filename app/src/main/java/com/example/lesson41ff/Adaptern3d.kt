package com.example.lesson41ff

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson41ff.databinding.ItemBinding

class Adaptern3d(private val workList2: List<ItemModel2>) :
    RecyclerView.Adapter<Adaptern3d.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(itemModel2: ItemModel2) = with(binding) {
            tvTitle.text = itemModel2.name
            tvDescription.text = itemModel2.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = workList2.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(workList2[position])
    }
}