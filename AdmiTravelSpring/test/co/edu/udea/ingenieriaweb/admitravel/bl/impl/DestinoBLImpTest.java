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

import co.edu.udea.ingenieriaweb.admitravel.bl.DestinoBL;
import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * @author D.yefry
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/spring_configuracion.xml")
public class DestinoBLImpTest {

	@Autowired
	DestinoBL destinoBL;
	
	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.DestinoBLImp#guardar
	 * (java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGuardar() {
		try {
			destinoBL.guardar("ColBol002", "Parque Nacional Natural corales", "");
			System.out.println("Destino guardado correctamente");
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
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.DestinoBLImp#actualizar
	 * (co.edu.udea.ingenieriaweb.admitravel.dto.Destino, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testActualizar() {
		Destino destino = new Destino();		
		try {
			destinoBL.actualizar(destino, "ColBol002", "Parque Nacional Natural corales", "Datos actualizados");
			assertTrue(true);
		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.DestinoBLImp#obtener(java.lang.String)}.
	 */
	@Test
	public void testObtener() {
		try {
			Destino destino = destinoBL.obtener("ColBol001");
			System.out.println("Identificación del Destino: " + destino.getIdDestino());
			System.out.println("Nombre del destino: " + destino.getNombre() + " ");
			System.out.println("Destalles del destino: " + destino.getDetalle() + " ");	
		} catch (IWDaoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
