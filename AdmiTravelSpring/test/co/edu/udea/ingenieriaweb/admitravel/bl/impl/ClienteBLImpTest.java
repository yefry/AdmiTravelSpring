/**
 * 
 */
package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.ingenieriaweb.admitravel.bl.ClienteBL;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * @author D.yefry
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/spring_configuracion.xml")
public class ClienteBLImpTest {

	/*
	 * Con @Autowired se le hace la inyección a los beans
	 * */
	@Autowired
	ClienteBL clienteBL;
	
	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ClienteBLImp#guardar
	 * (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, 
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGuardar() {
		try {
			clienteBL.guardar("1128393725", "Judith Peralta", "cc", "judi11@gmail.com", 
					"2345678", "3005678345", "", "", "si", "M");
			System.out.println("Cliente guardado");
			assertTrue(true);
		} catch (IWDaoException e) {
			fail(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ClienteBLImp#actualizar
	 * (co.edu.udea.ingenieriaweb.admitravel.dto.Cliente, java.lang.String, java.lang.String, 
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, 
	 * java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testActualizar() {		
		Cliente cliente = new Cliente();
		cliente.setIdentificacion("78933456");
		try {
			clienteBL.actualizar(cliente, "78933456", "Juan Gutierrez", "cc", 
					"emailactualizado", "", "", "", "", "", "");
			System.out.println("Datos del cliente actualizados");
			assertTrue(true);
		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ClienteBLImp#obtenerClientes()}.
	 */
	@Test
	public void testObtenerClientes() {
		try {
			List<Cliente> lista = clienteBL.obtenerClientes();
			for(Cliente cliente : lista){
				System.out.println("Cedula: " + cliente.getIdentificacion());
				System.out.println("Nombre completo: " + cliente.getNombres() + " ");
				System.out.println("Genero: " + cliente.getGenero() + " ");
			}
		} catch (IWDaoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ClienteBLImp#obtener(java.lang.String)}.
	 */
	@Test
	public void testObtener() {
		try {
			Cliente cliente = clienteBL.obtener("1023345789");
			System.out.println("Cedula: " + cliente.getIdentificacion());
			System.out.println("Nombre completo: " + cliente.getNombres() + " ");
			System.out.println("Genero: " + cliente.getGenero() + " ");
		} catch (IWDaoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
