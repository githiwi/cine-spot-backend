package com.tewenet.cinemaspot.data

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "CINEMA")
data class Cinema(

        @Id val id: Long,
        val name: String,
        val location: String
)