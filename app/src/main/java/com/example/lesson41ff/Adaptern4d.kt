package com.example.lesson41ff

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson41ff.databinding.ItemBinding

class Adaptern4d(private val workList3: List<ItemModel3>) :
    RecyclerView.Adapter<Adaptern4d.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(itemModel3: ItemModel3) = with(binding) {
            tvTitle.text = itemModel3.name
            tvDescription.text = itemModel3.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = workList3.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(workList3[position])
    }
}