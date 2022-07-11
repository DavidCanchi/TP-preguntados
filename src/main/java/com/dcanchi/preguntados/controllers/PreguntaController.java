package com.dcanchi.preguntados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcanchi.preguntados.entities.Pregunta;
import com.dcanchi.preguntados.service.PreguntaService;

@RestController
@RequestMapping("/api/preguntas")
public class PreguntaController {
	
	@Autowired
	private PreguntaService preguntaService;
	
	
	@GetMapping
	public List<Pregunta> getAllPreguntas() {
		return (List<Pregunta>) preguntaService.findAll();
	}

	
	@PostMapping
	public void createPregunta(@RequestBody Pregunta pregunta)	{
		preguntaService.save(pregunta);
	}
	
	@GetMapping("/{id}")
	public Pregunta getByIdPregunta(Long id) {
		return preguntaService.findById(id);
	}
	
	

}
