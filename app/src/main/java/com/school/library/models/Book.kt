package com.school.library.models

data class Book(
    val bookId: String = "",
    val title: String = "",
    val author: String = "",
    val isbn: String = "",
    val category: String = "",
    val totalCopies: Int = 0,
    val availableCopies: Int = 0,
    val shelfLocation: String = ""
)
