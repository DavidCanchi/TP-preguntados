package com.dcanchi.preguntados.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dcanchi.preguntados.entities.Opcion;
import com.dcanchi.preguntados.entities.Pregunta;
import com.dcanchi.preguntados.repository.QuestionadoRepository;
import com.dcanchi.preguntados.service.QuestionadoService;
@Service
public class QuestionadoServiceImpl implements QuestionadoService{
	@Autowired
	private QuestionadoRepository questionadoRepository;
	
	@Override
	public List<Pregunta> ObtenerPregunta() {
		return questionadoRepository.findAll();
	}

}
