package com.rafaeloliver.meckintech.domain


import javax.persistence.*


@Entity
class Categoria(

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String
)
