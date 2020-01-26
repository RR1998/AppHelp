package com.example.finalproject.useroverview

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityUserOverviewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserOverviewActivity: AppCompatActivity() {

    private lateinit var binding: ActivityUserOverviewBinding

    private val userOverViewViewModelInstance: UserOverViewViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this, R.layout.activity_user_overview)
        binding.userOverViewViewModel = userOverViewViewModelInstance
    }
}