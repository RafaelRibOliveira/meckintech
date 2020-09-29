package com.rafaeloliver.meckintech.resources

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categorias")
class CategoriaResource {

    @GetMapping
    fun listar() = "REST está funcionando"
}