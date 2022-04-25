package com.faisalgehlot.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faisalgehlot.recyclerview.databinding.ItemViewBinding

class MyAdapter constructor(private val songs: List<Song>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
        val view = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtTitle.text = songs[position].title
        holder.txtDescription.text = songs[position].description
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    // Now these are a nested class
    class MyViewHolder constructor( binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {

        var txtTitle = binding.textTitle
        var txtDescription = binding.textDescription
    }
}

//class MyViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
