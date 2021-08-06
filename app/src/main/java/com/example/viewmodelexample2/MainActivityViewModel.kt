package com.example.viewmodelexample2

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {

    private var total : Int = 0

    init{
        total = startingTotal
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(etEntryNumber: Int) {
        total += etEntryNumber
    }

}