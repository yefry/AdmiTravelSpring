package co.edu.udea.ingenieriaweb.admitravel.bl;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Clase ClienteBL define la funcionalidad a implementar en el ClienteBLImp
 * 
 * @author Yeferson Marín
 * 
 */
public interface ClienteBL {
	
	/**
	 * Método que permite almacenar un cliente en el sistema
	 * @param tipoIdentificacion tipo de identificación del cliente
	 * @param identificacion identificación del cliente
	 * @param nombres nombres del cliente
	 * @param email correo electrónico del cliente
	 * @param telefono teléfono del cliente
	 * @param celular1 número de celular del cliente
	 * @param celular2 número de celular del cliente
	 * @param direccion dirección de residencia del cliente
	 * @param pazysalvo estado de paz y salvo del cliente
	 * @param genero Identidad sexual, especialmente en relación con la sociedad o la cultura.
	 * @throws IWDaoException ocurre cuando hay un error en la base de datos
	 * @throws IWBLException ocurre cuando hay un error de lógica del negocio en los datos a guardar
	 */
	public void guardar(String identificacion, String nombres, String tipoIdentificacion, 
			String email, String telefono, String celular1, String celular2, String direccion, 
			String pazysalvo, String genero) throws IWDaoException, IWBLException;
	
	public void actualizar(Cliente cliente, String identificacion, String nombres, String tipoIdentificacion, 
			String email, String telefono, String celular1, String celular2, String direccion, 
			String pazysalvo, String genero) throws IWDaoException, IWBLException;
	
	List<Cliente> obtenerClientes() throws IWDaoException, IWBLException;

	Cliente obtener(String identificación) throws IWDaoException, IWBLException;

}
