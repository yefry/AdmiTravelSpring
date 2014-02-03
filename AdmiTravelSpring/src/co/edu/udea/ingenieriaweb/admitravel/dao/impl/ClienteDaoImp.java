package co.edu.udea.ingenieriaweb.admitravel.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.ingenieriaweb.admitravel.dao.ClienteDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementacion de la interface {ClienteDaoImp CiudadDao} en Hibernate integrado con Spring
 * @author Yeferson Marín
 *
 */
public class ClienteDaoImp extends HibernateDaoSupport implements ClienteDao {

	@Override
	public List<Cliente> obtenerClientes() throws IWDaoException {
		Session sesion = null;
		List<Cliente> lista = null;		
		try{
			sesion = getSession();			
			lista = sesion.createCriteria(Cliente.class).list();
//			lista = sesion.createCriteria(Cliente.class).addOrder(Order.asc("nombres")).list();
			return lista;			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public Cliente obtener(String identificacion) throws IWDaoException {
		Session sesion = null;
		Cliente cliente = null;		
		try{
			sesion = getSession();			
			cliente = (Cliente)sesion.get(Cliente.class, identificacion);					
			return cliente;			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

	@Override
	public void guardar(Cliente cliente) throws IWDaoException {
//		Session session = null;
		Transaction tx = null;
		try{
			tx = getSession().beginTransaction();
			getHibernateTemplate().save(cliente);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}
	
	@Override
	public void actualizar(Cliente cliente) throws IWDaoException {
//		Session session = null;
		try{
			getHibernateTemplate().update(cliente);
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
		
	}

}
