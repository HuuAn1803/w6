package com.example.w6.model

data class MovieResp (
    val dates: Dates? = null,
    val page: Long? = null,
    val results: List<Movie>? = null,
    val totalPages: Long? = null,
    val totalResults: Long? = null
)
