package com.rafaeloliver.meckintech.services

import com.rafaeloliver.meckintech.domain.Categoria
import com.rafaeloliver.meckintech.repositories.CategoriaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoriaService   (

    @Autowired
    private val  categoriaRepository: CategoriaRepository
        ){

    fun buscar(id: Long): Categoria? {
        val obj = categoriaRepository.findById(id).orElseThrow()
        return obj
    }
}
