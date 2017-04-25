package com.gmv.vodafone;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Simular entidad recuperada de la BBDD 
 */

public class Oferta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codigoOferta;
	private String referencia;
	private LocalDate fechaInicio;
	
	public Oferta() {
	}
	
	public int getCodigoOferta() {
		return codigoOferta;
	}
	public void setCodigoOferta(int codigoOferta) {
		this.codigoOferta = codigoOferta;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "Oferta [codigoOferta=" + codigoOferta + ", referencia=" + referencia + ", fechaInicio=" + fechaInicio
				+ "]";
	}
	
	

}
