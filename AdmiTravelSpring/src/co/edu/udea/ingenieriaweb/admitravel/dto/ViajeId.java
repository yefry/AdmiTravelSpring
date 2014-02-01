package co.edu.udea.ingenieriaweb.admitravel.dto;

import java.io.Serializable;

public class ViajeId implements Serializable{
	private String idViaje;
	private String idPaquete;

	public String getIdViaje() {
		return idViaje;
	}
	public void setIdViaje(String idViaje) {
		this.idViaje = idViaje;
	}	
	public String getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}
}
