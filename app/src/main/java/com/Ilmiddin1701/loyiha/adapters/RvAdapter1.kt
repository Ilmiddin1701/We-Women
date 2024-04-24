package com.Ilmiddin1701.loyiha.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Ilmiddin1701.loyiha.databinding.ItemRv1Binding
import com.Ilmiddin1701.loyiha.models.Data1

class RvAdapter1(var rvAction: RvAction, var list: Array<Data1>): RecyclerView.Adapter<RvAdapter1.Vh>() {

    inner class Vh(var itemRv1Binding: ItemRv1Binding) : RecyclerView.ViewHolder(itemRv1Binding.root) {

        fun onBinding(data1: Data1, position: Int) {
            itemRv1Binding.videoImage.setImageResource(data1.videoImage)
            itemRv1Binding.videoName.text = data1.videoName

            itemRv1Binding.root.setOnClickListener {
                rvAction.itemClick(data1, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRv1Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBinding(list[position], position)
    }

    interface RvAction{
        fun itemClick(data1: Data1, position: Int)
    }
}