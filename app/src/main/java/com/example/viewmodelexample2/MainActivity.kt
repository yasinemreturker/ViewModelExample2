package com.example.viewmodelexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var databinding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)


        viewModel.totalData.observe(this, Observer {
            databinding.tvSum.text = it.toString()
        })

        buttonController()

    }

    private fun init() {
        viewModelFactory = MainActivityViewModelFactory(125)
    }

    private fun buttonController() {

        databinding.buttonAdd.setOnClickListener {
            viewModel.setTotal(databinding.etEntryNumber.text.toString().toInt())
        }

    }
}
