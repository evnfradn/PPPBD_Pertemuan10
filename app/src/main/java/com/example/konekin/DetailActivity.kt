package com.example.konekin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.konekin.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val salary = intent.getIntExtra("salary", 0)
        val age = intent.getIntExtra("age", 0)

        binding.tvName.text = "Nama: $name"
        binding.tvSalary.text = "Gaji: $salary"
        binding.tvAge.text = "Umur: $age"
    }
}
