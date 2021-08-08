package com.example.viewmodelexample2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    get() = total

    init{
        total.value = startingTotal
    }

    fun setTotal(etEntryNumber: Int) {
        total.value = (total.value)?.plus(etEntryNumber)
    }

}