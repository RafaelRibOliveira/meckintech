package com.rafaeloliver.meckintech.domain


import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id



class CategoriaDomain (

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var name: String
)
