package com.example.booksrecomended.presentation.books.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.booksrecomended.data.model.Book
import com.example.booksrecomended.databinding.ItemBookBinding

class BooksHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private val binding = ItemBookBinding.bind(itemView)

    fun bindView(book: Book){
        binding.itemBookTitle.text = book.title
        binding.itemBookScope.text = book.scope
    }
}
