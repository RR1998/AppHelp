package com.example.finalproject.di

import com.example.finalproject.useroverview.UserOverViewViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    
    viewModel { UserOverViewViewModel() }
}

val coreModule = module {

}

val dataModule = module {

}
