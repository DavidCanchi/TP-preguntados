package com.dcanchi.preguntados.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta {
	@Id
    @Column(name = "idpregunta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPregunta;
	@Column(name = "pregunta", nullable = false)
	private String pregunta;
	//relacion con Entity
	
	//private Long idCategoria;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Categoria", referencedColumnName = "idCategoria")
	private Categoria categoria;
	
	
	public Pregunta() {
	}


	public Long getIdPregunta() {
		return idPregunta;
	}


	public void setIdPregunta(Long idPregunta) {
		this.idPregunta = idPregunta;
	}


	public String getPregunta() {
		return pregunta;
	}


	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	

}
