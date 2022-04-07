package com.jitusolution.adv160419006midtermproject.viewmodel

import androidx.lifecycle.MutableLiveData
import com.jitusolution.adv160419006midtermproject.model.Kuliner

class DetailViewModel {
    val KulinerLD = MutableLiveData<Kuliner>()
    fun fetch() {
        val Kuliner1 = Kuliner("0001","nasi goreng","3","panji jiwo rungkut 4A","08216645590")
        KulinerLD.value = Kuliner1
    }
}