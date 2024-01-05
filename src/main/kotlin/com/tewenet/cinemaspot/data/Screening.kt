package com.tewenet.cinemaspot.data

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "SCREENING")
data class Screening (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @ManyToOne
        @JoinColumn(name = "movie_id")
        val movie: Movie,

        @ManyToOne
        @JoinColumn(name = "hall_id")
        val hall: Hall,

        val startTime: LocalDateTime,
        val endTime: LocalDateTime
)