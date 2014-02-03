package co.edu.udea.ingenieriaweb.admitravel.dto;

import java.util.Set;

/**
 * Clase DTO para transportar la información de los clientes
 * 
 * @author Yeferson Marín
 * 
 */
public class Cliente {

	/**
	 * Número de identificación del cliente
	 */
	private String identificacion;

	/**
	 * Tipo de identificación del cliente, si es cédula, tarjeta de identidad o
	 * documento de extrangería
	 */
	private String tipoIdentificacion;

	/**
	 * Nombres y apellidos del cliente
	 */
	private String nombres;

	/**
	 * Dirección de correo electrónico del cliente
	 */
	private String email;

	/**
	 * teléfono del cliente
	 */
	private String telefono;

	/**
	 * número del celular del cliente
	 */
	private String celular1;

	/**
	 * segundo número del celular del cliente
	 */
	private String celular2;

	/**
	 * Dirección de residencia del cliente
	 */
	private String direccion;

	/**
	 * El cliente se encuentra a paz y salvo, no tiene deudas pendientes y a
	 * pagado los viajes como es debido.
	 */
	private String pazysalvo;

	/**
	 * Identidad sexual, especialmente en relación con la sociedad o la cultura.
	 */
	private String genero;
	
	/**
	 * Lista de viajes a los que ha ido un cliente
	 */
	Set<ClienteViaje> clienteViajes;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPazysalvo() {
		return pazysalvo;
	}

	public void setPazysalvo(String pazysalvo) {
		this.pazysalvo = pazysalvo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Set<ClienteViaje> getClienteViajes() {
		return clienteViajes;
	}

	public void setClienteViajes(Set<ClienteViaje> clienteViajes) {
		this.clienteViajes = clienteViajes;
	}

}
