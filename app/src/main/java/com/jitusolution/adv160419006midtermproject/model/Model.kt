package com.jitusolution.adv160419006midtermproject.model

import com.google.gson.annotations.SerializedName

data class Kuliner(
    val id:String?,
    @SerializedName("resto_name")
    val name:String?,
    val address:String?,
    @SerializedName("favorit_food")
    val favorit:String?,
    val phone:String?
)
