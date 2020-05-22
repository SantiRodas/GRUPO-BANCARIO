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
import modelo.Servicio;

class ServicioTest {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE SERVICIO

	Servicio servicio;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO EXTRA PARA QUE EL TEST SE VEA MUCHO MAS LINDO
	
	
	//****************************************************************************
	//POR FAVOR TENER ABIERTA LA VENTANA CONSOLA PARA VER EL DISE�O EXTRA DEL TEST
	//****************************************************************************
		
	@Test
	public void lindo() throws InterruptedException {
			
		String mensaje = "";
			
		String mensaje2 = "";
			
		System.out.println("");
		System.out.println("Realizando diagnostico del sistema");
		System.out.println("");
			
		for(int i = 0 ; i < 5 ; i ++) {
				
			mensaje += "**";
				
			Thread.sleep(1000);
				
			System.out.println(mensaje);
				
		}
			
		System.out.println("");
		System.out.println("Iniciando simulacion");
		System.out.println("");
			
		for(int y = 0 ; y < 5 ; y ++) {
				
			mensaje2 += "**";
				
			Thread.sleep(1000);
				
			System.out.println(mensaje2);
				
		}
			
		System.out.println("");
			
		System.out.println("------------------");
		System.out.println("Escaneo completado");
		System.out.println("------------------");
			
		Thread.sleep(3000);
			
		System.out.println("");
			
		System.out.println("---------------");
		System.out.println("Sistemas listos");
		System.out.println("---------------");
			
	}
	
	// ---------------------------------------------------------------------------------------
	
	// ESCENARIO NUMERO 1
	
	public void setup1() {
		
		servicio = new Servicio("Tarjeta de credito", 20000);
		
	}
	
	// ******************************************
	
	// ESCENARIO NUMERO 2
	
	public void setup2() throws InformacionExisteExcepcion {
		
		setup1();
		
		servicio.agregarCuenta("741852", 2000000);
		
		servicio.agregarCuenta("963789", 1000000);
		
		servicio.agregarCuenta("456357", 250000);
		
		servicio.agregarCuenta("59864", 100000);
		
		servicio.agregarCuenta("25401", 1500000);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA AGREAR UNA CUENTA
	
	@Test
	public void agregarCuentaTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("741852", servicio.getCuentas().get(0).getId());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR UNA CUENTA
	
	@Test
	public void agregarCuentaTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(5, servicio.getCuentas().size());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UNA CUENTA EN EL SISTEMA
	
	@Test
	public void buscarCuentaTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(servicio.buscar("456357"));
		
		assertFalse(servicio.buscar("28458541952965652692"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UNA CUENTA EN EL SISTEMA
	
	@Test
	public void buscarCuentaTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		servicio.agregarCuenta("000", 1000);
		
		assertTrue(servicio.buscar("000"));
		
		servicio.eliminar("000");
		
		assertFalse(servicio.buscar("000"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UNA CUENTA RETORNANDO LA CUENTA
	
	@Test
	public void buscarCuentaCuentaTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(100000, servicio.buscarCuentaCuenta("59864").getValor());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UNA CUENTA RETORNANDO LA CUENTA
	
	@Test
	public void buscarCuentaCuentaTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		servicio.agregarCuenta("123", 1000);
		
		assertTrue(servicio.buscar("123"));
		
		servicio.eliminar("123");
		
		assertNull(servicio.buscarCuentaCuenta("123"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UNA CUENTA EN EL SISTEMA
	
	@Test
	public void eliminarCuentaTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		servicio.eliminar("741852");
		
		assertEquals("963789", servicio.getCuentas().get(0).getId());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UNA CUENTA EN EL SISTEMA
	
	@Test
	public void eliminarCuentaTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		servicio.agregarCuenta("000", 1000);

		servicio.eliminar("000");
		
		assertEquals(0, servicio.getCuentas().size());
		
	}
	
	// ---------------------------------------------------------------------------------------

}
