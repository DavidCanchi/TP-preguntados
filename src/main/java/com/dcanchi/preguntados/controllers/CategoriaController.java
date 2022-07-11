package com.dcanchi.preguntados.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcanchi.preguntados.entities.Categoria;
import com.dcanchi.preguntados.service.CategoriaService;

@RestController
@RequestMapping("/api")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/categorias")
	public ArrayList<Categoria> getAllCategorias() {
		return this.categoriaService.getAllCategorias();
	}

	@GetMapping("/{id}")
	public Categoria getCategoria(Long id) {
		return this.categoriaService.getCategoria(id);
	}

	@PostMapping
	public void createCategoria(@RequestBody Categoria categoria) {
		categoriaService.save(categoria);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteCategoria(@PathVariable("id") Long id) {
		categoriaService.deleteById(id);
	}
}
