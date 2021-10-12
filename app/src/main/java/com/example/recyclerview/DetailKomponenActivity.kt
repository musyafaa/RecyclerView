package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailKomponenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_komponen)

        val komponenpc = intent.getParcelableExtra<komponenpc>(MainActivity.INTENT_PARCELABLE)

        val imgkomponenpc = findViewById<ImageView>(R.id.img_item_photo)
        val namekomponenpc = findViewById<TextView>(R.id.tv_item_name)
        val desckomponenpc = findViewById<TextView>(R.id.tv_item_description)

        imgkomponenpc.setImageResource(komponenpc?.imgkomponenpc!!)
        namekomponenpc.text = komponenpc.namekomponenpc
        desckomponenpc.text = komponenpc.desckomponenpc

    }
}