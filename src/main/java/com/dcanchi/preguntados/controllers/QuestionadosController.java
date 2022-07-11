package com.dcanchi.preguntados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcanchi.preguntados.entities.Opcion;
import com.dcanchi.preguntados.entities.Pregunta;
import com.dcanchi.preguntados.service.QuestionadoService;

@RestController
@RequestMapping("/api/questionados")
public class QuestionadosController {
	@Autowired
	private QuestionadoService questionadoService;
	
	@GetMapping("/preguntados/next")
    public List<Pregunta> traerPreguntaRandom()  {

        return questionadoService.ObtenerPregunta();
    }
  /*  @GetMapping("/preguntados/verificaciones/{id}")
    public ValidacionRespuestaDTO verificarRespuesta(@PathVariable(value = "id",required = true) Long id)  {

        return preguntadosService.validarRespuesta(id);
    }
	*/

}
