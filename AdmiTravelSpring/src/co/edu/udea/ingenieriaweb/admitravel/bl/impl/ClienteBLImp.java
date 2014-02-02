package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import java.util.List;

import org.hibernate.cfg.annotations.IdBagBinder;

import co.edu.udea.ingenieriaweb.admitravel.bl.ClienteBL;
import co.edu.udea.ingenieriaweb.admitravel.dao.ClienteDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public class ClienteBLImp implements ClienteBL {
	
	ClienteDao clienteDao;

	/**
	 * @see ClienteBL#guardar(String, String, String, String, String, String, String, String, String, String)
	 */
	@Override
	public void guardar(String identificacion, String nombres, String tipoIdentificacion, 
			String email, String telefono, String celular1, String celular2, String direccion, 
			String pazysalvo, String genero) throws IWDaoException, IWBLException {
		
		if(identificacion == null || "".equals(identificacion))
			throw new IWBLException("La identificación del cliente no puede ser un valor nulo no vacio");
		
		if(nombres == null 	|| "".equals(nombres))
			throw new IWBLException("El nombre del cliente no puede ser nulo ni un valor vacío");

		if(tipoIdentificacion == null || "".equals(tipoIdentificacion))
			throw new IWBLException(
					"El tipo de identificación del cliente no puede ser nulo ni un valor vacío");
		
		if(pazysalvo == null || "".equals(pazysalvo))
			throw new IWBLException("El estado de paz y salvo del cliente no puede ser nulo ni un valor vacío");
		
		if(genero == null || "".equals(genero))
			throw new IWBLException(
					"El campo de identidad sexual del cliente no puede ser nulo ni un valor vacío");
		
		Cliente cliente = new Cliente();
		cliente.setIdentificacion(identificacion);		
		cliente.setNombres(nombres);
		cliente.setTipoIdentificacion(tipoIdentificacion);
		cliente.setEmail(email);	
		cliente.setTelefono(telefono);
		cliente.setCelular1(celular1);
		cliente.setCelular2(celular2);
		cliente.setDireccion(direccion);
		cliente.setPazysalvo(pazysalvo);
		cliente.setGenero(genero);
		clienteDao.guardar(cliente);		
	}

	@Override
	public void actualizar(Cliente cliente, String identificacion, String nombres,
			String tipoIdentificacion, String email, String telefono,
			String celular1, String celular2, String direccion,
			String pazysalvo, String genero) throws IWDaoException,
			IWBLException {
		
		if(identificacion != null && !"".equals(identificacion))
			cliente.setIdentificacion(identificacion);
	
		if(nombres != null 	&& !"".equals(nombres))
			cliente.setNombres(nombres);
	
		if(tipoIdentificacion != null && !"".equals(tipoIdentificacion))
			cliente.setTipoIdentificacion(tipoIdentificacion);
		
		if(pazysalvo != null && !"".equals(pazysalvo))
			cliente.setPazysalvo(pazysalvo);
		
		if(genero != null && !"".equals(genero))
			cliente.setGenero(genero);
		
		cliente.setEmail(email);	
		cliente.setTelefono(telefono);
		cliente.setCelular1(celular1);
		cliente.setCelular2(celular2);
		cliente.setDireccion(direccion);
		clienteDao.actualizar(cliente);		
	}
	
	@Override
	public List<Cliente> obtenerClientes() throws IWDaoException, IWBLException{
		return clienteDao.obtener();
	}
	
	@Override
	public Cliente obtener(String cedula) throws IWDaoException, IWBLException{
		return clienteDao.obtener(cedula);
	}

	public ClienteDao getClienteDAO() {
		return clienteDao;
	}

	public void setClienteDAO(ClienteDao clienteDAO) {
		this.clienteDao = clienteDAO;
	}
	
}
