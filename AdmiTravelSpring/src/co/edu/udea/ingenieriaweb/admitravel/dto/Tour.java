package co.edu.udea.ingenieriaweb.admitravel.dto;

/**
 * Clase DTO para transportar la informaci�n de los Toures
 * 
 * @author Yeferson Mar�n
 * 
 */
public class Tour {
	
	/**
	 * Nombre o lugares de los toures
	 * */
	private String nombre;
	
	/**
	 * Detalles del tour
	 * */
	private String detalle;
	
	/**
	 * identificaci�n del tour
	 * */
	private TourId idTour;
	
	public TourId getIdTour() {
		return idTour;
	}
	public void setIdTour(TourId idTour) {
		this.idTour = idTour;
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
