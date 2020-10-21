package com.rafaeloliver.meckintech

import com.rafaeloliver.meckintech.domain.Categoria
import com.rafaeloliver.meckintech.repositories.CategoriaRepository
 import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class MeckintechApplication(
		 private val categoriaRepository: CategoriaRepository
): CommandLineRunner {

	override fun run(vararg args: String?) {

		val cat1 = Categoria(name =  "Informática")
		val cat2 = Categoria(name =  "Escrit[orio")

		categoriaRepository.saveAll(listOf(cat1, cat2))
	}


}
fun main(args: Array<String>) {
	runApplication<MeckintechApplication>(*args)
}