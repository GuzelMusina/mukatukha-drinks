package com.almaz.mukatukha_drinks.core.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val id: String,
    val name: String,
    val price: String,
    val volume: String,
    val category: String,
    val withMilk: Boolean,
    val otherDetails: String?
): Parcelable