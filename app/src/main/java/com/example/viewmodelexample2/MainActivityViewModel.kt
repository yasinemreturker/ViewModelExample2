package com.example.viewmodelexample2

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var total : Int = 0

    fun getTotal(): Int {
        return total
    }

    fun setTotal(etEntryNumber: Int) {
        total += etEntryNumber
    }

}