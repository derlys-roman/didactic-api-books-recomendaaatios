package com.example.booksrecomended.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.booksrecomended.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData : MutableLiveData<List<Book>> = MutableLiveData()

    fun getBook(){
        booksLiveData.value = createFakeBooks()
    }

    private fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Escoria","Tudo"),
            Book("Parasite","Everything"),
            Book("Subject","Any")
        )
    }
}