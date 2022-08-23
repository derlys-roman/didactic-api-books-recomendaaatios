package com.example.booksrecomended.presentation.books.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.booksrecomended.R
import com.example.booksrecomended.data.model.Book
import com.example.booksrecomended.databinding.ActivityBooksBinding
import com.example.booksrecomended.presentation.books.adapter.BooksAdapter

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding
    private lateinit var adapter: BooksAdapter
    private var testBook = mutableListOf<Book>(
        Book("Tony", "Iron man"),
        Book("Tony", "Iron man2"),
        Book("Tony", "Iron man3")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarActivityBooks.title = getString(R.string.books)
        initRecycler()

    }
    private fun initRecycler(){
        adapter = BooksAdapter(testBook)
        binding.rvitemlist.layoutManager = LinearLayoutManager(this)
        binding.rvitemlist.adapter = adapter
    }
}