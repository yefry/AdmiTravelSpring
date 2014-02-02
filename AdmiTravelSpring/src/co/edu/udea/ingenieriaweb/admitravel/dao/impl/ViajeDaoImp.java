package co.edu.udea.ingenieriaweb.admitravel.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.ingenieriaweb.admitravel.dao.ViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.dto.ViajeId;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementacion de la interface {ViajeDaoImp ViajeDao} en Hibernate integrado con Spring
 * @author Yeferson Marín
 *
 */
public class ViajeDaoImp extends HibernateDaoSupport implements ViajeDao {

	@Override
	public List<Viaje> obtener() throws IWDaoException {
		Session sesion = null;
		List<Viaje> lista = null;		
		try{
			sesion = getSession();			
			lista = sesion.createCriteria(Viaje.class)
					      .add(Restrictions.ne("eliminado", new Boolean(true)))
					      .addOrder(Order.asc("fecha"))
						  .list();			
			return lista;			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public Viaje obtener(ViajeId id) throws IWDaoException {
		Session sesion = null;
		Viaje viaje = null;
		try{
			sesion = getSession();
			viaje = (Viaje)sesion.get(Viaje.class, id);
			return viaje;
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public void guardar(Viaje viaje) throws IWDaoException {
		Session session = null;
		Transaction tx = null;
		try{
			tx = getSession().beginTransaction();
			getHibernateTemplate().save(viaje);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}
	
	@Override
	public void actualizar(Viaje viaje) throws IWDaoException {
		Session session = null;
		try{
			getHibernateTemplate().update(viaje);
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
		
	}
}
