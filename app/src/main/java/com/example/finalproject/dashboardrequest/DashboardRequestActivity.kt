package com.example.finalproject.dashboardrequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityDashboardRequestBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DashboardRequestActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityDashboardRequestBinding
    private  val dashboardViewModel: DashboardViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard_request)
        binding.dashboardViewModel = dashboardViewModel
    }
}
