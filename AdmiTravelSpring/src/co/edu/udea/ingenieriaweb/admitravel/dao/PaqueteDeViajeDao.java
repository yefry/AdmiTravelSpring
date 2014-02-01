package co.edu.udea.ingenieriaweb.admitravel.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Define la funcionalidad a implementar en el DAO de Paquete de Viaje
 * @author Yeferson Marín
 *
 */
public interface PaqueteDeViajeDao {
	
	/**
	 * Entrega todos los paquetes de viaje que se encuentran almacenados en el sistema, sin importar
	 * si esta eliminado o no.
	 * @return lista de paquetes de viaje
	 * @throws IWDaoException
	 */
	public List<PaqueteDeViaje> obtener() throws IWDaoException;
	
	/**
	 * Entrega los datos de un paquete de viaje dado su idPaquete, si el paquete de viaje no exite retorna null
	 * @param idPaquete: identificación del paquete de viaje
	 * @return instancia del paquete de viaje con los datos, si no existe retorna nulo.
	 * @throws IWDaoException
	 */
	public PaqueteDeViaje obtener(String idPaquete) throws IWDaoException;
	
	/**
	 * Guarda los datos de un paquete de viaje, teniendo en cuenta los datos que pueden ser nulos
	 * @param paquetedeviaje: datos del paquetedeviaje
	 * @return nada, solo se guardan los datos del paquete de viaje
	 * @throws IWDaoException
	 */
	public void guardar(PaqueteDeViaje paquetedeviaje) throws IWDaoException;
	
	/**
	 * Actualiza los datos de un paquete de viaje, teniendo en cuenta que datos pueden ser nulos
	 * @param paquetedeviaje: datos del paquete de viaje a actualizar
	 * @return nada, solo se actualizan los datos del paquete de viaje.
	 * @throws IWDaoException
	 */
	public void actualizar(PaqueteDeViaje paquetedeviaje) throws IWDaoException;
	
//	public void eliminar(Paqueteviaje paquetedeviaje) throws IWDaoException;
}
