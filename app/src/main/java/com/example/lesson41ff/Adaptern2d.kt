package com.example.lesson41ff

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson41ff.databinding.ItemBinding

class Adaptern2d(private val workList: List<ItemModel>) :
    RecyclerView.Adapter<Adaptern2d.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(itemModel: ItemModel) = with(binding) {
            tvTitle.text = itemModel.name
            tvDescription.text = itemModel.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = workList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(workList[position])
    }
}