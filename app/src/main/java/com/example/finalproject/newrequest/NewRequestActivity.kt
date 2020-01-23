package com.example.finalproject.newrequest

import android.annotation.SuppressLint
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R

class NewRequestActivity : AppCompatActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_request)
        val c = Calendar.getInstance()
        val dp = findViewById<DatePicker>(R.id.new_request_datepicker)
        dp.minDate = c.timeInMillis
    }
}