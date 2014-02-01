package co.edu.udea.ingenieriaweb.admitravel.dto;

/**
 * Clase DTO para transportar la informaci�n de los Destinos
 * 
 * @author Yeferson Mar�n
 * 
 */
public class Destino {
	
	/**
	 * Identificaci�n del destino
	 */
	private String idDestino;
	
	/**
	 * Nombre del destino
	 * */
	private String nombre;
	
	/**
	 * Detalles a tener en cuenta del destino
	 * */
	private String detalle;
	
	public String getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}	
}
