package co.edu.udea.ingenieriaweb.admitravel.bl;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
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
	 * @param idDestino tipo de identificación del destino
	 * @param nombre nombre del destino
	 * @param detalle del destino	 
	 * @throws IWDaoException ocurre cuando hay un error en la base de datos
	 * @throws IWBLException ocurre cuando hay un error de lógica del negocio en los datos a guardar
	 */
	public void guardar(String idDestino, String nombre, String detalle) throws IWDaoException, IWBLException;
	
	public void actualizar(Destino destino, String idDestino, String nombre, String detalle) 
			throws IWDaoException, IWBLException;

	Destino obtener(String idDestino) throws IWDaoException, IWBLException;

}
