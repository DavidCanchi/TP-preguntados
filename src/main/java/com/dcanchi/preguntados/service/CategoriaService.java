package com.dcanchi.preguntados.service;

import java.util.ArrayList;

import com.dcanchi.preguntados.entities.Categoria;


public interface CategoriaService {
	public  ArrayList<Categoria> getAllCategorias();

	public Categoria getCategoria(Long id);

	public void save(Categoria categoria);

	public void deleteById(Long id);
	

}
