package co.edu.udea.ingenieriaweb.admitravel.bl;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Clase ClienteBL define la funcionalidad a implementar en el ClienteBLImp
 * 
 * @author Yeferson Mar�n
 * 
 */
public interface ClienteBL {
	
	/**
	 * M�todo que permite almacenar un cliente en el sistema
	 * @param tipoIdentificacion tipo de identificaci�n del cliente
	 * @param identificacion identificaci�n del cliente
	 * @param nombres nombres del cliente
	 * @param email correo electr�nico del cliente
	 * @param telefono tel�fono del cliente
	 * @param celular1 n�mero de celular del cliente
	 * @param celular2 n�mero de celular del cliente
	 * @param direccion direcci�n de residencia del cliente
	 * @param pazysalvo estado de paz y salvo del cliente
	 * @param genero Identidad sexual, especialmente en relaci�n con la sociedad o la cultura.
	 * @throws IWDaoException ocurre cuando hay un error en la base de datos
	 * @throws IWBLException ocurre cuando hay un error de l�gica del negocio en los datos a guardar
	 */
	public void guardar(String identificacion, String nombres, String tipoIdentificacion, 
			String email, String telefono, String celular1, String celular2, String direccion, 
			String pazysalvo, String genero) throws IWDaoException, IWBLException;
	
	public void actualizar(Cliente cliente, String identificacion, String nombres, String tipoIdentificacion, 
			String email, String telefono, String celular1, String celular2, String direccion, 
			String pazysalvo, String genero) throws IWDaoException, IWBLException;
	
	List<Cliente> obtenerClientes() throws IWDaoException, IWBLException;

	Cliente obtener(String identificaci�n) throws IWDaoException, IWBLException;

}
