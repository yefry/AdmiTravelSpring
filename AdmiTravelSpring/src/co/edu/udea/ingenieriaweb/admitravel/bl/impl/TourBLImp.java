package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import java.util.List;

import org.hibernate.cfg.annotations.IdBagBinder;

import co.edu.udea.ingenieriaweb.admitravel.bl.DestinoBL;
import co.edu.udea.ingenieriaweb.admitravel.dao.DestinoDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public class TourBLImp implements DestinoBL {
	
	DestinoDao destinoDao;

	/**
	 * @see DestinoBL#guardar(String, String, String)
	 */
	@Override
	public void guardar(String idDestino, String nombre, String detalle) throws IWDaoException, IWBLException {
		
		if(idDestino == null || "".equals(idDestino))
			throw new IWBLException("La identificación del destino no puede ser un valor nulo no vacio");
		
		if(nombre == null 	|| "".equals(nombre))
			throw new IWBLException("El nombre del destino no puede ser nulo ni un valor vacío");
		
		Destino destino = new Destino();
		destino.setIdDestino(idDestino);
		destino.setNombre(nombre);
		destino.setDetalle(detalle);
		destinoDao.guardar(destino);		
	}

	@Override
	public void actualizar(Destino destino, String idDestino, String nombre, String detalle) 
			throws IWDaoException, IWBLException {
		
		if(idDestino != null && !"".equals(idDestino))
			destino.setIdDestino(idDestino);
	
		if(nombre != null 	&& !"".equals(nombre))
			destino.setNombre(nombre);
	
		destino.setDetalle(detalle);
		destinoDao.actualizar(destino);		
	}
	
	
	@Override
	public Destino obtener(String idDestino) throws IWDaoException, IWBLException{
		return destinoDao.obtener(idDestino);
	}
	
	public DestinoDao getDestinoDao() {
		return destinoDao;
	}

	public void setDestinoDao(DestinoDao destinoDao) {
		this.destinoDao = destinoDao;
	}
	
}
