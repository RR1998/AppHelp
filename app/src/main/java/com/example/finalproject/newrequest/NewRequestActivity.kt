package com.example.finalproject.newrequest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityNewRequestBinding

class NewRequestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewRequestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_new_request)

    }
}