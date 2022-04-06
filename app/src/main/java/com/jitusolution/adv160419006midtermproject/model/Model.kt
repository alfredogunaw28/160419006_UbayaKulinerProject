package com.jitusolution.adv160419006midtermproject.model

import com.google.gson.annotations.SerializedName

data class Kuliner(
    val id:String?,
    @SerializedName("order_name")
    val name:String?,
    @SerializedName("number_of_order")
    val numberorder:String?,
    val phone:String?
)
