package com.tewenet.cinemaspot.data

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "MOVIE")
data class Movie(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val title: String,
        val duration: Int,
        val genre: String,
        val posterUrl: String,
        val director: String,
        val releaseDate: LocalDate
)