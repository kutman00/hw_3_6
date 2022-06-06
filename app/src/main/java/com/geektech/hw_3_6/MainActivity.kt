package com.geektech.hw_3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.geektech.hw_3_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        addFragment(SecondFragment())
        binding.container
    }
}