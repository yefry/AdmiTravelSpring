package co.edu.udea.ingenieriaweb.admitravel.bl;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Clase DestinoBL define la funcionalidad a implementar en el DestinoBLImp
 * 
 * @author Yeferson Mar�n
 * 
 */
public interface PaqueteDeViajeBL {
	
	/**
	 * M�todo que permite almacenar un paquete de viaje en el sistema
	 * @param idPaquete tipo de identificaci�n del paquete de viaje
	 * @param destinos nombre del destinos (Este parametro no deber�a ir)
	 * @param transporte transporte en el que se hace el viaje
	 * @param alimentacion alimentaci�n que lleva el viaje	 	 
	 * @param duracionViaje duraci�n del viaje tomado
	 * @throws IWDaoException ocurre cuando hay un error en la base de datos
	 * @throws IWBLException ocurre cuando hay un error de l�gica del negocio en los datos a guardar
	 */
	public void guardar(String idPaquete, String destinos, String transporte, String alimentacion, 
			String duracionViaje) throws IWDaoException, IWBLException;
	
	public void actualizar(PaqueteDeViaje paqueteDeViaje, String idPaquete, String destinos, 
			String transporte, String alimentacion,	String duracionViaje)throws IWDaoException, IWBLException;

	PaqueteDeViaje obtener(String idPaquete) throws IWDaoException, IWBLException;

}
