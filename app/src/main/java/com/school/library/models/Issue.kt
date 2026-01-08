package com.school.library.models

data class Issue(
    val issueId: String = "",
    val bookId: String = "",
    val admissionNumber: String = "",
    val issueDate: String = "",
    val dueDate: String? = null,
    val status: String = "ISSUED",
    val returnDate: String? = null,
    val remarks: String? = null
)
