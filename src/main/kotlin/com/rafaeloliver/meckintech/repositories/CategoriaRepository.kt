package com.rafaeloliver.meckintech.repositories

import com.rafaeloliver.meckintech.domain.Categoria
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoriaRepository : JpaRepository<Categoria, Long> {

}
