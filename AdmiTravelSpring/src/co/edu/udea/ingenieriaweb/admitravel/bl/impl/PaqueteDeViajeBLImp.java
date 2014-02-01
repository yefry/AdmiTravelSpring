package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import java.util.List;

import org.hibernate.cfg.annotations.IdBagBinder;

import co.edu.udea.ingenieriaweb.admitravel.bl.PaqueteDeViajeBL;
import co.edu.udea.ingenieriaweb.admitravel.dao.PaqueteDeViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public class PaqueteDeViajeBLImp implements PaqueteDeViajeBL {
	
	PaqueteDeViajeDao paqueteDeViajeDao;

	/**
	 * @see PaqueteDeViajeBL#guardar(String, String, String, String, String)
	 */
	@Override
	public void guardar(String idPaquete, String destinos, String transporte, String alimentacion, 
			String duracionViaje) throws IWDaoException, IWBLException {
		
		if(idPaquete == null || "".equals(idPaquete))
			throw new IWBLException("La identificación del paquete de viaje no puede ser un valor nulo no vacio");
		
		if(destinos == null 	|| "".equals(destinos))
			throw new IWBLException("(Campo no debería existir) *El nombre del destino no puede ser nulo ni un valor vacío");
		
		if(transporte == null 	|| "".equals(transporte))
			throw new IWBLException("El tipo de transporte del paquete de viaje no puede ser nulo ni un valor vacío");
		
		if(alimentacion == null 	|| "".equals(alimentacion))
			throw new IWBLException("El tipo de alimentacion del paquete de viaje no puede ser nulo ni un valor vacío");
		
		if(duracionViaje == null 	|| "".equals(duracionViaje))
			throw new IWBLException("La duración del viaje no puede ser nulo ni un valor vacío");
		
		PaqueteDeViaje paqueteDeViaje = new PaqueteDeViaje();
		paqueteDeViaje.setIdPaquete(idPaquete);
		paqueteDeViaje.setDestinos(destinos);
		paqueteDeViaje.setTransporte(transporte);
		paqueteDeViaje.setAlimentacion(alimentacion);
		paqueteDeViaje.setDuracionViaje(duracionViaje);
		paqueteDeViajeDao.guardar(paqueteDeViaje);		
	}

	@Override
	public void actualizar(PaqueteDeViaje paqueteDeViaje, String idPaquete, String destinos, String transporte, 
			String alimentacion, String duracionViaje) throws IWDaoException, IWBLException {
		
		if(idPaquete != null && !"".equals(idPaquete))
			paqueteDeViaje.setIdPaquete(idPaquete);
	
		if(destinos != null 	&& !"".equals(destinos))
			paqueteDeViaje.setDestinos(destinos);
		
		if(transporte != null 	&& !"".equals(transporte))
			paqueteDeViaje.setTransporte(transporte);
		
		if(alimentacion != null 	&& !"".equals(alimentacion))
			paqueteDeViaje.setAlimentacion(alimentacion);
		
		if(duracionViaje != null 	&& !"".equals(duracionViaje))
			paqueteDeViaje.setDestinos(destinos);	
		
		paqueteDeViajeDao.actualizar(paqueteDeViaje);		
	}	
	
	@Override
	public PaqueteDeViaje obtener(String idPaquete) throws IWDaoException, IWBLException{
		return paqueteDeViajeDao.obtener(idPaquete);
	}
	
	public PaqueteDeViajeDao getPaqueteDeViajeDao() {
		return paqueteDeViajeDao;
	}

	public void setPaqueteDeViajeDao(PaqueteDeViajeDao paqueteDeViajeDao) {
		this.paqueteDeViajeDao = paqueteDeViajeDao;
	}
	
}
