package com.example.booksrecomended.presentation.books.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.booksrecomended.R
import com.example.booksrecomended.databinding.ActivityBooksBinding
import com.example.booksrecomended.presentation.books.adapter.BooksAdapter

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding
    private lateinit var adapter: BooksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarActivityBooks.title = getString(R.string.books)
        initRecycler()

    }
    private fun initRecycler(){
        //TODO
        adapter = BooksAdapter(emptyList())
        binding.rvitemlist.layoutManager = LinearLayoutManager(this)
        binding.rvitemlist.adapter = adapter
    }
}