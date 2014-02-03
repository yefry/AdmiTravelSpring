/**
 * 
 */
package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.ingenieriaweb.admitravel.bl.PaqueteDeViajeBL;
import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * @author D.yefry
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/spring_configuracion.xml")
public class PaqueteDeViajeBLImpTest {

	@Autowired
	PaqueteDeViajeBL paqueteDeViajeBL;
	
	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.PaqueteDeViajeBLImp#guardar
	 * (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGuardar() {
		try {
			paqueteDeViajeBL.guardar("SaMCar003", "Santa Marta y Cartagena", "vuelo", "Des, cena", "5 Noches, 4 Días");
			System.out.println("Paquete de viaje guardado");
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
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.PaqueteDeViajeBLImp#actualizar
	 * (co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje, java.lang.String, java.lang.String, 
	 * java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testActualizar() {
		PaqueteDeViaje paquete = new PaqueteDeViaje();
		try {
			paqueteDeViajeBL.actualizar(paquete, "SaMCar003", "Santa Marta y Cartagena", "vuelo", "Des, Almuerzo", "4 Noches, 3 Días");
			assertTrue(true);
		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.PaqueteDeViajeBLImp#obtener(java.lang.String)}.
	 */
	@Test
	public void testObtener() {
		try {
			PaqueteDeViaje paquete = paqueteDeViajeBL.obtener("SaMCar001");			
			System.out.println("Identificación del paquete: " + paquete.getIdPaquete());
			System.out.println("Tipo de transporte: " + paquete.getTransporte() + " ");
			System.out.println("Tiempo que dura el viaje: " + paquete.getDuracionViaje() + " ");
		} catch (IWDaoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
