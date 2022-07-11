package com.dcanchi.preguntados.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
