/**
 * 
 */
package co.edu.udea.ingenieriaweb.admitravel.bl.impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.ingenieriaweb.admitravel.bl.ViajeBL;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.dto.ViajeId;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * @author D.yefry
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/spring_configuracion.xml")
public class ViajeBLImpTest {

	@Autowired
	ViajeBL viajeBL; 
	
	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ViajeBLImp#guardar
	 * (co.edu.udea.ingenieriaweb.admitravel.dto.ViajeId, int, java.util.Date, java.lang.String)}.
	 */
	@Test
	public void testGuardar() {	
		ViajeId id = new ViajeId();
		Date fecha = new Date(2014, 02, 15);
		try {
			viajeBL.guardar(id, 400000, fecha, "en curso");			
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
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ViajeBLImp#actualizar
	 * (co.edu.udea.ingenieriaweb.admitravel.dto.Viaje, co.edu.udea.ingenieriaweb.admitravel.dto.ViajeId, 
	 * int, java.util.Date, java.lang.String)}.
	 */
	@Test
	public void testActualizar() {
		Viaje viaje = new Viaje();
		ViajeId id = new ViajeId();
		viaje.setId(id);
		Date fecha = new Date(2014, 02, 15);
		try {
			viajeBL.actualizar(viaje, id, 300000, fecha, "en curso");
			System.out.println("Datos del viaje actualizados");
			assertTrue(true);
		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ViajeBLImp#obtenerViajes()}.
	 */
	@Test
	public void testObtenerViajes() {
		try {
			List<Viaje> lista = viajeBL.obtenerViajes();
			for(Viaje viaje : lista){
				System.out.println("Fecha en la que se hace el viaje: " + viaje.getFecha());
				System.out.println("Estado del viaje: " + viaje.getEstado() + " ");
				System.out.println("Precio del viaje: " + viaje.getPrecio() + " ");
			}
		} catch (IWDaoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link co.edu.udea.ingenieriaweb.admitravel.bl.impl.ViajeBLImp#obtener(co.edu.udea.ingenieriaweb.admitravel.dto.ViajeId)}.
	 */
//	@Test
//	public void testObtener() {
//		try {
//			Viaje viaje = viajeBL.obtener(id);
//			System.out.println("Fecha en la que se hace el viaje: " + viaje.getFecha());
//			System.out.println("Estado del viaje: " + viaje.getEstado() + " ");
//			System.out.println("Precio del viaje: " + viaje.getPrecio() + " ");
//		} catch (IWDaoException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
