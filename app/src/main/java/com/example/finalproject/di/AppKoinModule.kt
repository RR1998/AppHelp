package com.example.finalproject.di

import com.example.finalproject.login.LoginViewModel
import com.example.finalproject.newrequest.NewRequestViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { LoginViewModel() }

    viewModel { NewRequestViewModel() }
}

val coreModule = module {

}

val dataModule = module {

}
