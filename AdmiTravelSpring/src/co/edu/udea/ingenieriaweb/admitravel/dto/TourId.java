package co.edu.udea.ingenieriaweb.admitravel.dto;

import java.io.Serializable;

public class TourId implements Serializable{
	
	private String idTour;
	private String idDestino;
	
	public String getIdTour() {
		return idTour;
	}
	public void setIdTour(String idTour) {
		this.idTour = idTour;
	}
	public String getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}
}
