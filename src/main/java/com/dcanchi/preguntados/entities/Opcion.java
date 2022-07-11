package com.dcanchi.preguntados.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "opciones")
public class Opcion {
	@Id
    @Column(name = "id_opcion")
	private Long idOpcion;
    @Column(name = "texto")
	private String texto;
    @Column(name = "es_Correcta")
	private boolean esCorrecta;
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="idPregunta",referencedColumnName="id",nullable=false,unique=true)
    private Pregunta pregunta;*/
    @Column(name = "opcion")
    private int opcion;
	
	
	public Long getIdOpcion() {
		return idOpcion;
	}
	public void setIdOpcion(Long idOpcion) {
		this.idOpcion = idOpcion;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public boolean isEsCorrecta() {
		return esCorrecta;
	}
	public void setEsCorrecta(boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}
	/*public Pregunta getPregunta() {
		return pregunta;
	}
	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
	*/
	public int getOpcion() {
		return opcion;
	}
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

}
