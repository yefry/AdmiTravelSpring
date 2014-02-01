package co.edu.udea.ingenieriaweb.admitravel.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.ingenieriaweb.admitravel.dao.TourDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementacion de la interface {TourDaoImp TourDao} en Hibernate integrado con Spring
 * @author Yeferson Marín
 *
 */
public class TourDaoImp extends HibernateDaoSupport implements TourDao {

	@Override
	public Tour obtener(String idTour) throws IWDaoException {
		Session sesion = null;
		Tour tour = null;		
		try{
			sesion = getSession();			
			tour = (Tour)sesion.get(Tour.class, idTour);
			return tour;
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public void guardar(Tour tour) throws IWDaoException {
		Session session = null;
		Transaction tx = null;
		try{
			tx = getSession().beginTransaction();
			getHibernateTemplate().save(tour);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}
	
	@Override
	public void actualizar(Tour tour) throws IWDaoException {
		Session session = null;
		try{
			getHibernateTemplate().update(tour);
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}
}
