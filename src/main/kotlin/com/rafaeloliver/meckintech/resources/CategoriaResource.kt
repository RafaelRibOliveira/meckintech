package com.rafaeloliver.meckintech.resources

import com.rafaeloliver.meckintech.domain.CategoriaDomain
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categorias")
class CategoriaResource {

    @GetMapping
    fun listar(): MutableList<CategoriaDomain> {
        val cat1 = CategoriaDomain(1, "Informática")
        val cat2 = CategoriaDomain(2, "Escritório")

        val lista = mutableListOf(cat1, cat2)

        return lista

    }
}