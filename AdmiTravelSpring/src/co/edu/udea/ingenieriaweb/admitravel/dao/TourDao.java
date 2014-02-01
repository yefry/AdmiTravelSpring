package co.edu.udea.ingenieriaweb.admitravel.dao;

import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Define la funcionalidad a implementar en el DAO de Tour
 * @author Yeferson Marín
 *
 */
public interface TourDao {
	
	/**
	 * Entrega los datos de un tour dado su idTour, si el Tour no exite retorna null
	 * @param idTour: identificación del tour
	 * @return instancia del tour con los datos, si no existe retorna nulo.
	 * @throws IWDaoException
	 */
	public Tour obtener(String idTour) throws IWDaoException;
	
	/**
	 * Guarda los datos de un tour, teniendo en cuenta los datos que pueden ser nulos
	 * @param tour: datos del tour
	 * @return nada, solo se guardan los datos del tour.
	 * @throws IWDaoException
	 */
	public void guardar(Tour tour) throws IWDaoException;
	
	/**
	 * Actualiza los datos de un tour, teniendo en cuenta que datos pueden ser nulos
	 * @param tour: datos del tour a actualizar
	 * @return nada, solo se actualizan los datos del tour.
	 * @throws IWDaoException
	 */
	public void actualizar(Tour tour) throws IWDaoException;
	
//	public void eliminar(Tour tour) throws IWDaoException;
}
