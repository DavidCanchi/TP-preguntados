package com.dcanchi.preguntados.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcanchi.preguntados.entities.Pregunta;
import com.dcanchi.preguntados.repository.PreguntaRepository;
import com.dcanchi.preguntados.service.PreguntaService;
@Service
public class PreguntaServiceImpl implements PreguntaService {
	@Autowired
	private PreguntaRepository preguntaRepository;
	

	@Override
	public List<Pregunta> findAll() {
		return preguntaRepository.findAll(); 
	}

	@Override
	public void save(Pregunta pregunta) {
		preguntaRepository.save(pregunta);
		
	}

	@Override
	public Pregunta findById(Long id) {
		return preguntaRepository.findById(id).get();
	}

}
