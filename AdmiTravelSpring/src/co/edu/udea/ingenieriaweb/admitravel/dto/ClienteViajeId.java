package co.edu.udea.ingenieriaweb.admitravel.dto;

import java.io.Serializable;

public class ClienteViajeId implements Serializable{
	private String identificacion;
	private String idViaje;
	private String idPaquete;
	
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
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
