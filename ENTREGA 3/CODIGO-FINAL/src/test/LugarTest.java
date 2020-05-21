/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.InformacionExisteExcepcion;
import excepciones.NoExisteInformacionExcepcion;
import modelo.Lugar;

class LugarTest {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION CON LAS CLASE LUGAR
	
	Lugar lugar;
	
	// ---------------------------------------------------------------------------------------
	
	// ESCENARIO NUMERO 1 
	
	public void setup1() {
		
		lugar = new Lugar("Villacolombia", "12345", "Calle 49 A # 10 a 32", "3", "villacolombia@gmail.com");
		
	}
	
	// ******************************************
	
	// ESCENARIO NUMERO 2
	
	public void setup2() throws InformacionExisteExcepcion {
		
		setup1();
		
		lugar.agregarCliente("Santiago", "1193419196", "Calle 49 a # 10 a 32", "3", "srodas@gmail.com", "rodas425");
		
		lugar.agregarCliente("Nolberto", "77108854", "Calle 49 a # 10 a 32", "5", "nolber@gmail.com", "nolbertor");
		
		
		lugar.agregarEmpleado("Miguel", "123", "Cali", "3", "No tiene", "Informacion", 1000);
		
		lugar.agregarEmpleado("David", "789", "Bogota", "4", "No tiene", "Caja", 2000);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA AGREGAR CLIENTE

	@Test
	public void agregarClienteTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.getPrimerCliente().getNombre() == "Santiago");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR CLIENTE
	
	@Test
	public void agregarClienteTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("77108854", lugar.getPrimerCliente().getSiguiente().getId());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA AGREGAR EMPLEADO
	
	@Test
	public void agregarEmpleadoTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.getPrimerEmpleado().getEstratoEconomico() == "3");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR EMPLEADO
	
	@Test
	public void agregarEmpleadoTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("David", lugar.getPrimerEmpleado().getSiguiente().getNombre());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR CLIENTE
	
	@Test
	public void buscarClienteTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscar("1193419196"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR CLIENTE
	
	@Test
	public void buscarClienteTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscar("77108854"));
		
		assertFalse(lugar.buscar("8521859849625625692"));
		
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR EMPLEADO
	
	@Test
	public void buscarEmpleadoTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscarEmpleado("123"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR EMPLEADO
	
	@Test
	public void buscarEmpleadoTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscarEmpleado("789"));
		
		assertFalse(lugar.buscarEmpleado("29852625692"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN CLIENTE QUE RETORNA EL CLIENTE
	
	@Test
	public void buscarClienteClienteTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscarClienteCliente("1193419196").getNombre() == "Santiago");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN CLIENTE QUE RETORNA EL CLIENTE
	
	@Test
	public void buscarClienteClienteTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscarClienteCliente("77108854").getDireccion() == "Calle 49 a # 10 a 32");
		
		assertNull(lugar.buscarClienteCliente("952582692562"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN EMPLEADO QUE RETORNA UN EMPLEADO
	
	@Test
	public void buscarEmpleadoEmpleadoTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscarEmpleadoEmpleado("123").getNombre() == "Miguel");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN EMPLEADO QUE RETORNA UN EMPLEADO
	
	@Test
	public void buscarEmpleadoEmpleadoTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(lugar.buscarEmpleadoEmpleado("789").getDireccion() == "Bogota");
		
		assertNull(lugar.buscarEmpleadoEmpleado("296526415262"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN CLIENTE DEL SISTEMA
	
	@Test
	public void eliminarClienteTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		assertTrue(lugar.eliminar("1193419196"));
		
		assertFalse(lugar.buscar("1193419196"));
		
		assertTrue(lugar.getPrimerCliente().getNombre() == "Nolberto");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN CLIENTE DEL SISTEMA
	
	@Test
	public void eliminarClienteTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		lugar.agregarCliente("Santiago", "1193419196", "Calle 49 a # 10 a 32", "3", "srodas@gmail.com", "rodas425");
	
		assertEquals(true, lugar.buscar("1193419196"));
		
		lugar.eliminar("1193419196");
		
		assertFalse(lugar.buscar("1193419196"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN EMPLEADO DEL SISTEMA
	
	@Test
	public void eliminarEmpleadoTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		assertTrue(lugar.eliminarEmpleado("123"));
		
		assertFalse(lugar.buscarEmpleado("123"));
		
		assertEquals("David", lugar.getPrimerEmpleado().getNombre());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN EMPLEADO DEL SISTEMA
	
	@Test
	public void eliminarEmpleadoTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		lugar.agregarEmpleado("Miguel", "123", "Cali", "3", "No tiene", "Informacion", 1000);
		
		assertEquals(true, lugar.buscarEmpleado("123"));
		
		lugar.eliminarEmpleado("123");
		
		assertFalse(lugar.buscarEmpleado("123"));
		
	}
	
	// ---------------------------------------------------------------------------------------

}
