package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import java.util.List;

import org.hibernate.cfg.annotations.IdBagBinder;

import co.edu.udea.ingenieriaweb.admitravel.bl.TourBL;
import co.edu.udea.ingenieriaweb.admitravel.dao.TourDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.dto.TourId;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWBLException;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public class TourBLImp implements TourBL {
	
	TourDao tourDao;

	/**
	 * @see TourBL#guardar(String, String, String)
	 */
	@Override
	public void guardar(String idTour, String nombre, String detalle) throws IWDaoException, IWBLException {
		
		if(idTour == null || "".equals(idTour))
			throw new IWBLException("La identificación del Tour no puede ser un valor nulo no vacio");
		
		if(nombre == null 	|| "".equals(nombre))
			throw new IWBLException("El nombre del Tour no puede ser nulo ni un valor vacío");
		
		Tour tour = new Tour();		
//		tour.setIdTour(tour);
		tour.setNombre(nombre);
		tour.setDetalle(detalle);
		tourDao.guardar(tour);		
	}

	@Override
	public void actualizar(Tour tour, String idTour, String nombre, String detalle) 
			throws IWDaoException, IWBLException {			
		
//		if(idTour != null && !"".equals(idTour))
//			tour.setIdTour(tourId);;
	
		if(nombre != null 	&& !"".equals(nombre))
			tour.setNombre(nombre);
	
		tour.setDetalle(detalle);
		tourDao.actualizar(tour);		
	}
	
	
	@Override
	public Tour obtener(String idTour) throws IWDaoException, IWBLException{
		return tourDao.obtener(idTour);
	}
	
	public TourDao getDestinoDao() {
		return tourDao;
	}

	public void setDestinoDao(TourDao tourDao) {
		this.tourDao = tourDao;
	}
	
}
