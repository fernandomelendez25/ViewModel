package com.melendez.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.melendez.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel : MainViewModel by viewModels()
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.actionSearch
        binding.viewModel = this.viewModel
        binding.lifecycleOwner = this
    }

    private fun addListeners(){
        binding.actionSearch.setOnClickListener {
            viewModel.onSearch()
        }
    }
}