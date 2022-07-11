package com.dcanchi.preguntados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcanchi.preguntados.entities.Pregunta;

public interface PreguntaRepository extends JpaRepository<Pregunta,Long>{

}
