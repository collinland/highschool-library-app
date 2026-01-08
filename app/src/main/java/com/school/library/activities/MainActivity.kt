package com.school.library.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.school.library.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBooks.setOnClickListener {
            startActivity(Intent(this, BooksActivity::class.java))
        }
        binding.btnStudents.setOnClickListener {
            startActivity(Intent(this, StudentsActivity::class.java))
        }
        binding.btnIssue.setOnClickListener {
            startActivity(Intent(this, IssueBooksActivity::class.java))
        }
        binding.btnReturn.setOnClickListener {
            startActivity(Intent(this, ReturnBooksActivity::class.java))
        }
        binding.btnReports.setOnClickListener {
            startActivity(Intent(this, ReportsActivity::class.java))
        }
    }
}
