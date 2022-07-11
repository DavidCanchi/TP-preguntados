package com.dcanchi.preguntados.service;

import java.util.List;

import com.dcanchi.preguntados.entities.Pregunta;

public interface PreguntaService {

	public List<Pregunta> findAll();

	public void save(Pregunta pregunta);

	public Pregunta findById(Long id);

}
