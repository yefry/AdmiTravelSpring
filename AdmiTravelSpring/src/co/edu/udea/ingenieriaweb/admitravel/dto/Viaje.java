package co.edu.udea.ingenieriaweb.admitravel.dto;

import java.util.Date;
import java.util.Set;

/**
 * Clase DTO para transportar la información de los Viajes
 * 
 * @author Yeferson Marín
 * 
 */
public class Viaje implements java.io.Serializable {

	/**
	 * Identificación del viaje
	 */
	private ViajeId id;

	/**
	 * Datos del paquete de viaje asociado
	 */
	private PaqueteDeViaje paqueteDeViaje;
	
	/**
	 * Valor que debe pagar cada persona por el viaje
	 */
	private int precio;
	
	/**
	 * Fecha de cuando fue realizado el viaje
	 */
	private Date fecha;
	
	/**
	 * Estado del viaje si esta en curso, si aún no esta en curso o si ya finalizo el viaje
	 */
	private String estado;
	
	/**
	 * Lista de clientes que han ido a un viaje
	 */
	private Set<ClienteViaje> clienteViajes;

	public PaqueteDeViaje getPaqueteDeViaje() {
		return paqueteDeViaje;
	}

	public void setPaqueteDeViaje(PaqueteDeViaje paqueteDeViaje) {
		this.paqueteDeViaje = paqueteDeViaje;
	}

	public Set<ClienteViaje> getClienteViajes() {
		return clienteViajes;
	}

	public void setClienteViajes(Set<ClienteViaje> clienteViajes) {
		this.clienteViajes = clienteViajes;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}	
	
	public ViajeId getId() {
		return id;
	}

	public void setId(ViajeId id) {
		this.id = id;
	}

}
