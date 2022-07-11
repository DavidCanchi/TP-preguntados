package com.dcanchi.preguntados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcanchi.preguntados.entities.Opcion;
import com.dcanchi.preguntados.entities.Pregunta;

public interface QuestionadoRepository extends JpaRepository<Pregunta,Long>{

}
