package co.edu.udea.ingenieriaweb.admitravel.bl;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Clase DestinoBL define la funcionalidad a implementar en el DestinoBLImp
 * 
 * @author Yeferson Marín
 * 
 */
public interface TourBL {
	
	/**
	 * Método que permite almacenar un destino en el sistema
	 * @param idTour tipo de identificación del Tour
	 * @param nombre nombre del tour
	 * @param detalle del tour	 
	 * @throws IWDaoException ocurre cuando hay un error en la base de datos
	 * @throws IWBLException ocurre cuando hay un error de lógica del negocio en los datos a guardar
	 */
	public void guardar(String idTour, String nombre, String detalle) throws IWDaoException, IWBLException;
	
	public void actualizar(Tour tour, String idTour, String nombre, String detalle) 
			throws IWDaoException, IWBLException;

	Tour obtener(String idTour) throws IWDaoException, IWBLException;

}
