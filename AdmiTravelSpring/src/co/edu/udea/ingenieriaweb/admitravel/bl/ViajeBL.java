package co.edu.udea.ingenieriaweb.admitravel.bl;

import java.util.Date;
import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.dto.ViajeId;
import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Clase ClienteBL define la funcionalidad a implementar en el ClienteBLImp
 * 
 * @author Yeferson Mar�n
 * 
 */
public interface ViajeBL {
	
	/**
	 * M�todo que permite almacenar un viaje en el sistema
	 * @param id identificaci�n del viaje
	 * @param paqueteDeViaje datos del paquete de viaje asociado
	 * @param precio Valor que debe pagar cada persona por el viaje
	 * @param fecha Fecha de cuando fue realizado el viaje
	 * @param estado Estado del viaje si esta en curso, si a�n no esta en curso o si ya finalizo el viaje
	 * @throws IWDaoException ocurre cuando hay un error en la base de datos
	 * @throws IWBLException ocurre cuando hay un error de l�gica del negocio en los datos a guardar
	 */
	public void guardar(ViajeId id, int precio, Date fecha, String estado) throws IWDaoException, IWBLException;
	
	public void actualizar(Viaje viaje, ViajeId id, int precio, Date fecha, 
			String estado) throws IWDaoException, IWBLException;
	
	List<Viaje> obtenerViajes() throws IWDaoException, IWBLException;

	Viaje obtener(ViajeId id) throws IWDaoException, IWBLException;

}
