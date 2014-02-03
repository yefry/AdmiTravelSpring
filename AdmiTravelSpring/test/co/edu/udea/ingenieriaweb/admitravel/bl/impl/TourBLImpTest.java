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

import co.edu.udea.ingenieriaweb.admitravel.bl.TourBL;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * @author D.yefry
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/spring_configuracion.xml")
public class TourBLImpTest {

	@Autowired
	TourBL tourBL ;
	
	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.TourBLImp#guardar
	 * (java.lang.String, java.lang.String, java.lang.String)}.
	 */
//	@Test
//	public void testGuardar() {
//		try {
//			tourBL.guardar("", "", "");
//			assertTrue(true);
//		} catch (IWDaoException e) {
//			fail(e.getMessage());
//			e.printStackTrace();
//		} catch (Exception e) {
//			fail(e.getMessage());
//			e.printStackTrace();
//		}
//	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.TourBLImp#actualizar
	 * (co.edu.udea.ingenieriaweb.admitravel.dto.Destino, java.lang.String, java.lang.String, java.lang.String)}.
	 */
//	@Test
//	public void testActualizar() {
//		Destino destino = new Destino();
//		try {
//			tourBL.actualizar(destino, "", "", "");
//			assertTrue(true);
//		} catch (Exception e) {
//			fail(e.getMessage());
//			e.printStackTrace();
//		}
//	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.TourBLImp#obtener(java.lang.String)}.
	 */
	@Test
	public void testObtener() {
		try {
			Tour tour = tourBL.obtener(idDestino);
			System.out.println("Nombre del Tour: " + tour.getNombre() + " ");
			System.out.println("Destalles del Tour: " + tour.getDetalle() + " ");
		} catch (IWDaoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
