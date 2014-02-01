package co.edu.udea.ingenieriaweb.admitravel.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.ingenieriaweb.admitravel.dao.PaqueteDeViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementacion de la interface {PaqueteDeViajeDaoImp PaqueteDeViajeDao} en Hibernate integrado con Spring
 * @author Yeferson Marín
 *
 */
public class PaqueteDeViajeDaoImp extends HibernateDaoSupport implements PaqueteDeViajeDao {

	@Override
	public List<PaqueteDeViaje> obtener() throws IWDaoException {
		Session sesion = null;
		List<PaqueteDeViaje> lista = null;		
		try{
			sesion = getSession();			
			lista = sesion.createCriteria(PaqueteDeViaje.class)
					      .add(Restrictions.ne("eliminado", new Boolean(true)))
					      .addOrder(Order.asc("idPaquete"))
						  .list();			
			return lista;			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public PaqueteDeViaje obtener(String idPaquete) throws IWDaoException {
		Session sesion = null;
		PaqueteDeViaje paqueteDeViaje = null;		
		try{
			sesion = getSession();						
			paqueteDeViaje = (PaqueteDeViaje)sesion.get(PaqueteDeViaje.class, idPaquete);
			return paqueteDeViaje;
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public void guardar(PaqueteDeViaje paqueteDeViaje) throws IWDaoException {
		Session session = null;
		Transaction tx = null;
		try{
			tx = getSession().beginTransaction();
			getHibernateTemplate().save(paqueteDeViaje);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}
	
	@Override
	public void actualizar(PaqueteDeViaje paqueteDeViaje) throws IWDaoException {
		Session session = null;
		try{
			getHibernateTemplate().update(paqueteDeViaje);
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
	}
}
