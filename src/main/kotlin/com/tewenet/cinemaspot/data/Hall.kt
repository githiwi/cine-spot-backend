package com.tewenet.cinemaspot.data

import jakarta.persistence.*

@Entity
@Table(name = "HALL")
data class Hall(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @ManyToOne
        @JoinColumn(name = "cinema_id")
        val cinema: Cinema,

        val hallName: String,
        val capacity: Int
)
