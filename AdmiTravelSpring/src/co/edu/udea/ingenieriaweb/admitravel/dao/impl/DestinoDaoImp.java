package co.edu.udea.ingenieriaweb.admitravel.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.ingenieriaweb.admitravel.dao.DestinoDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementacion de la interface {DestinoDaoImp DestinoDao} en Hibernate integrado con Spring
 * @author Yeferson Marín
 *
 */
public class DestinoDaoImp extends HibernateDaoSupport implements DestinoDao {

	@Override
	public Destino obtener(String idDestino) throws IWDaoException {
		Session sesion = null;
		Destino destino = null;
		
		try{
			sesion = getSession();			
			destino = (Destino)sesion.get(Destino.class, idDestino);					
			return destino;			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public void guardar(Destino destino) throws IWDaoException {
		Session session = null;
		Transaction tx = null;
		try{
			tx = getSession().beginTransaction();
			getHibernateTemplate().save(destino);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}
	
	@Override
	public void actualizar(Destino destino) throws IWDaoException {
		Session session = null;
		try{
			getHibernateTemplate().update(destino);
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
	}
}
