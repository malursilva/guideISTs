package com.github.malursilva.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.malursilva.R
import com.github.malursilva.model.Disease
import kotlinx.android.synthetic.main.view_holder_main.view.*

class MainRecyclerViewAdapter(
    private var list: List<Disease>,
    val onItemClick: ((Disease) -> Unit)?
) : RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.view_holder_main,
            parent,
            false
        ))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(disease: Disease) = with(itemView) {
            setOnClickListener {
                onItemClick?.invoke(disease)
            }
            view_holder_name.text = disease.name

        }
    }
}