package com.example.sms.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sms.R
import com.example.sms.models.Sher

class RecyclerAdapter(var list: ArrayList<Sher>,var listerner:OnClick):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(sher: Sher){
            itemView.apply {
                findViewById<TextView>(R.id.sherHeading).text = sher.heading
                findViewById<TextView>(R.id.sher).text = sher.sher
            }
            itemView.setOnClickListener {
                listerner.onItemClick(sher)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int  = list.size

}

interface  OnClick{
    fun onItemClick(model:Sher)
}