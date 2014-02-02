package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.cfg.annotations.IdBagBinder;

import co.edu.udea.ingenieriaweb.admitravel.bl.ViajeBL;
import co.edu.udea.ingenieriaweb.admitravel.dao.ViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.dto.ViajeId;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public class ViajeBLImp implements ViajeBL {
	
	ViajeDao viajeDao;

	/**
	 * @see ViajeBL#guardar(ViajeId, PaqueteDeViaje, int, Date, String)
	 */
	@Override
	public void guardar(ViajeId id, int precio, Date fecha, String estado) throws IWDaoException, IWBLException {
		
		if(id == null || "".equals(id))
			throw new IWBLException("La identificación del viaje no puede ser un valor nulo no vacio");
		
		if("".equals(precio))
			throw new IWBLException("El precio del viaje no puede ser un valor vacío");
		
		if(fecha == null || "".equals(fecha))
			throw new IWBLException("La fecha del viaje no puede ser nulo ni un valor vacío");
		
		if(estado == null || "".equals(estado))
			throw new IWBLException("El campo de estado del viaje no puede ser nulo ni un valor vacío");
		
		Viaje viaje = new Viaje();
		viaje.setId(id);
		viaje.setEstado(estado);
		viaje.setFecha(fecha);
		viaje.setPrecio(precio);
		viajeDao.guardar(viaje);		
	}

	@Override
	public void actualizar(Viaje viaje, ViajeId id, int precio, Date fecha, 
			String estado) throws IWDaoException, IWBLException {
		
		if(id != null && !"".equals(id))
			viaje.setId(id);
	
		if(!"".equals(precio))
			viaje.setPrecio(precio);
	
		if(fecha != null && !"".equals(fecha))
			viaje.setFecha(fecha);
		
		if(estado != null && !"".equals(estado))
			viaje.setEstado(estado);
		
		viajeDao.actualizar(viaje);		
	}
	
	@Override
	public List<Viaje> obtenerViajes() throws IWDaoException, IWBLException{
		return viajeDao.obtener();
	}
	
	@Override
	public Viaje obtener(ViajeId id) throws IWDaoException, IWBLException{
		return viajeDao.obtener(id);
	}	

	public ViajeDao getViajeDao() {
		return viajeDao;
	}

	public void setViajeDao(ViajeDao viajeDao) {
		this.viajeDao = viajeDao;
	}
	
}
