package com.example.finalproject.newrequest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityNewRequestBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewRequestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewRequestBinding

    private val newRequestVieModelInstance: NewRequestViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_new_request)
        binding.newRequestActivityViewModel = newRequestVieModelInstance

    }
}