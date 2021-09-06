package com.rawan.yarab

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*


class ExampleAdapter (private val exampleList:List<ExampleItem>):RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent,false)


        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem=exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text=currentItem.text1
        holder.textView2.text=currentItem.text2

        if (position==0){
            holder.textView1.setBackgroundColor(Color.YELLOW)
        }


    }


    override fun getItemCount(): Int {
        return exampleList.size

    }
    class ExampleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.image_View
        val textView1 :TextView=itemView.text_View_1
        val textView2 :TextView=itemView.text_View_2
    }
}