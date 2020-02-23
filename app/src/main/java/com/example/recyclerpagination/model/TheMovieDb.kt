package com.example.recyclerpagination.model

data class TheMovieDb(
    val dates: Dates,
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)