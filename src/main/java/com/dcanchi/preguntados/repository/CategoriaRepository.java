package com.dcanchi.preguntados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcanchi.preguntados.entities.Categoria;

//@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
