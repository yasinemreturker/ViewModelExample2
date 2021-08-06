package com.example.viewmodelexample2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.IllegalArgumentException

class MainActivityViewModelFactory(private var startingTotal: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActivityViewModel(startingTotal) as T
        throw IllegalArgumentException("Unknown View Model Class")
    }


}