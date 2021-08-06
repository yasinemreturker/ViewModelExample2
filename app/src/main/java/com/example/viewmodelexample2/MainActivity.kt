package com.example.viewmodelexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var databinding : ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        databinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        databinding.tvSum.text = viewModel.getTotal().toString()
        buttonController()

    }

    private fun buttonController() {

        databinding.buttonAdd.setOnClickListener {
            viewModel.setTotal(databinding.etEntryNumber.text.toString().toInt())
            databinding.tvSum.text = viewModel.getTotal().toString()
        }

    }
}
