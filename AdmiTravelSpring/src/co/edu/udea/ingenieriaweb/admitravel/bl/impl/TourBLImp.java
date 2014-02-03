package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import java.util.List;

import org.hibernate.cfg.annotations.IdBagBinder;

import co.edu.udea.ingenieriaweb.admitravel.bl.DestinoBL;
import co.edu.udea.ingenieriaweb.admitravel.bl.TourBL;
import co.edu.udea.ingenieriaweb.admitravel.dao.DestinoDao;
import co.edu.udea.ingenieriaweb.admitravel.dao.TourDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.dto.TourId;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public class TourBLImp implements TourBL {
	
	TourDao tourDao;

	/**
	 * @see DestinoBL#guardar(String, String, String)
	 */
	@Override
	public void guardar(String idTour, String nombre, String detalle) throws IWDaoException, IWBLException {
		
		if(idTour == null || "".equals(idTour))
			throw new IWBLException("La identificación del Tour no puede ser un valor nulo no vacio");
		
		if(nombre == null 	|| "".equals(nombre))
			throw new IWBLException("El nombre del Tour no puede ser nulo ni un valor vacío");
		
		Tour tour = new Tour();
		TourId tourId = new TourId();
		tour.setIdTour(tourId);
		tour.setNombre(nombre);
		tour.setDetalle(detalle);
		tourDao.guardar(tour);		
	}

	@Override
	public void actualizar(Tour tour, String idTour, String nombre, String detalle) 
			throws IWDaoException, IWBLException {			
		
		if(idDestino != null && !"".equals(idDestino))
			tour.setIdTour(tourId);;
	
		if(nombre != null 	&& !"".equals(nombre))
			tour.setNombre(nombre);
	
		tour.setDetalle(detalle);
		tourDao.actualizar(tour);		
	}
	
	
	@Override
	public Destino obtener(String idDestino) throws IWDaoException, IWBLException{
		return tourDao.obtener(idDestino);
	}
	
	public DestinoDao getDestinoDao() {
		return tourDao;
	}

	public void setDestinoDao(DestinoDao destinoDao) {
		this.tourDao = destinoDao;
	}
	
}
