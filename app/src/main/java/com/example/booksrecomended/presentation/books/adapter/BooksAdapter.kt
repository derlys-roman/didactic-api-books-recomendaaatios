package com.example.booksrecomended.presentation.books.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.booksrecomended.data.model.Book
import com.example.booksrecomended.databinding.ItemBookBinding

class BooksAdapter(private val book: List<Book>) : RecyclerView.Adapter<BooksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksHolder {
        val itemView = ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return BooksHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksHolder, position: Int) {
        val book = book[position]
        with(holder){
            binding.itemBookTitle.text = book.title
            binding.itemBookScope.text = book.scope
        }
    }

    override fun getItemCount() = book.count()

}