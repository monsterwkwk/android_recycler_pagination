package com.example.recyclerpagination.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TheMovieDb(
    val dates: Dates,
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
):Parcelable