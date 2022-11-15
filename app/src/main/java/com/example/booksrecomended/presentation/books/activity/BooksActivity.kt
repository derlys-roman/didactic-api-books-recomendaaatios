package com.example.booksrecomended.presentation.books.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.booksrecomended.R
import com.example.booksrecomended.databinding.ActivityBooksBinding
import com.example.booksrecomended.presentation.books.BooksViewModel
import com.example.booksrecomended.presentation.books.adapter.BooksAdapter

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarActivityBooks.title = getString(R.string.books)

        val viewModel : BooksViewModel = ViewModelProviders.of(this)[BooksViewModel::class.java]
        viewModel.booksLiveData.observe(this) {
            it?.let { books ->
                with(binding.rvitemlist) {
                    layoutManager = LinearLayoutManager(this@BooksActivity)
                    setHasFixedSize(true)
                    adapter = BooksAdapter(books)
                }
            }
        }
        viewModel.getBook()
    }

}