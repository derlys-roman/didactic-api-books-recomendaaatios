package com.example.booksrecomended.presentation.books.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksrecomended.R
import com.example.booksrecomended.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarActivityBooks.title = getString(R.string.books)
    }
}