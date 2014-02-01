package co.edu.udea.ingenieriaweb.admitravel.dto;

/**
 * Clase DTO para transportar la información de los Viajes con los clientes que participaron de él
 * 
 * @author Yeferson Marín
 * 
 */
public class ClienteViaje {
	
	/**
	 * El estado de pago es si el cliente canceló todo y se encuentra a paz y salvo o si solo abono
	 */
	private String estadoPago;
	private ClienteViajeId id;
	/**
	 * Datos del viaje
	 * */
	private Viaje viaje;
	/**
	 * Datos del cliente
	 * */
	private Cliente cliente;
	
	public Viaje getViaje() {
		return viaje;
	}
	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ClienteViajeId getId() {
		return id;
	}
	public void setId(ClienteViajeId id) {
		this.id = id;
	}
	public String getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}
	
}
