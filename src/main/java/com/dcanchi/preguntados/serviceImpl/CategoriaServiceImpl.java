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
	
	@Override
	public ArrayList<Categoria> getAllCategorias(){		
       return (ArrayList<Categoria>) categoriaRepository.findAll(); //implementar repository	
    }
	
	public Categoria getCategoria(Long id) {
		return categoriaRepository.findById(id).get();
	}

	@Override
	public void save(Categoria categoria) {
		categoriaRepository.save(categoria);
		
	}

	@Override
	public void deleteById(Long id) {
		categoriaRepository.deleteById(id);
		
	}
	
	
	
	
}
