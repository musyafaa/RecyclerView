package com.example.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class komponenpc(
    val imgkomponenpc: Int,
    val namekomponenpc: String,
    val desckomponenpc: String,
)  : Parcelable
