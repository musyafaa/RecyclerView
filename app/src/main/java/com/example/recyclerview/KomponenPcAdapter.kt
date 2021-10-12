package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KomponenPcAdapter(private val context: Context, private val komponenpc: List<komponenpc>, val listener: (komponenpc) -> Unit)
    : RecyclerView.Adapter<KomponenPcAdapter.komponenpcViewHolder>(){

    class komponenpcViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgkomponenpc = view.findViewById<ImageView>(R.id.img_item_photo)
        val namekomponenpc = view.findViewById<TextView>(R.id.tv_item_name)
        val desckomponenpc = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(komponenpc: komponenpc, listener: (komponenpc) -> Unit){
            imgkomponenpc.setImageResource(komponenpc.imgkomponenpc)
            namekomponenpc.text = komponenpc.namekomponenpc
            desckomponenpc.text = komponenpc.desckomponenpc

            itemView.setOnClickListener{
                listener(komponenpc)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): komponenpcViewHolder {
        return komponenpcViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_komponenpc, parent, false)
        )
    }

    override fun onBindViewHolder(holder: komponenpcViewHolder, position: Int) {
        holder.bindView(komponenpc[position], listener)
    }

    override fun getItemCount(): Int = komponenpc.size

    }

