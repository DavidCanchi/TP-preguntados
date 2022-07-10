package com.dcanchi.preguntados.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcanchi.preguntados.entities.Categoria;
import com.dcanchi.preguntados.repository.CategoriaRepository;
import com.dcanchi.preguntados.service.CategoriaService;
@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	public ArrayList<Categoria> getAllCategorias(){		
       return (ArrayList<Categoria>) categoriaRepository.findAll(); //implementar repository	
    }
}
