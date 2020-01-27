package com.example.finalproject.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    private val loginViewModelInstance: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.loginActivityViewModel = loginViewModelInstance
    }
}