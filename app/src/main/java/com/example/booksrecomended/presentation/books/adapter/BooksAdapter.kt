package com.example.booksrecomended.presentation.books.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.booksrecomended.R
import com.example.booksrecomended.data.model.Book

class BooksAdapter(private val book: List<Book>) : RecyclerView.Adapter<BooksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BooksHolder(layoutInflater.inflate(R.layout.item_book, parent, false))
    }

    override fun onBindViewHolder(holder: BooksHolder, position: Int) {
        holder.bindView(book[position])
    }

    override fun getItemCount() = book.count()

}