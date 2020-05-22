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
import modelo.Controladora;

class ControladoraTest {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE CONTROLADORA
		
	Controladora controladora;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO EXTRA PARA QUE EL TEST SE VEA MUCHO MAS LINDO
	
	
	//****************************************************************************
	//POR FAVOR TENER ABIERTA LA VENTANA CONSOLA PARA VER EL DISEÑO EXTRA DEL TEST
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
		
		controladora = new Controladora();
		
	}
	
	// ******************************************
	
	// ESCENARIO NUMERO 2
	
	public void setup2() throws InformacionExisteExcepcion {
		
		setup1();
		
		controladora.agregar("Banco de bogota", "860002964");
		
		controladora.agregar("Banco de occidente", "890300279");
		
		controladora.agregar("Banco popular", "860007738");
		
		controladora.agregar("Banco av villas", "860035827");
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA AGREGAR UN BANCO A LA LISTA ENLAZADA 

	@Test
	public void agregarTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(controladora.getPrimerBanco().getNombre() == "Banco de bogota");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR UN BANCO A LA LISTA ENLAZADA 
	
	@Test
	public void agregarTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("890300279", controladora.getPrimerBanco().getSiguiente().getId());
		
	}
	
	// ******************************************
	
	// TEST 3 PARA AGREGAR UN BANCO A LA LISTA ENLAZADA 
	
	@Test
	public void agregarTest3() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertNotNull(controladora.getPrimerBanco().getSiguiente().getSiguiente());
		
	}
	
	// ******************************************
	
	// TEST 4 PARA AGREGAR UN BANCO A LA LISTA ENLAZADA 
	
	@Test
	public void agregarTest4() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(controladora.getPrimerBanco().getSiguiente().getSiguiente().getNombre() == "Banco popular");
		
	}
	
	// ******************************************
	
	// TEST 5 PARA AGREGAR UN BANCO A LA LISTA ENLAZADA 
	
	@Test
	public void agregarTest5() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertNull(controladora.getPrimerBanco().getAnterior());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA
	
	@Test
	public void buscarBooleanoTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(controladora.buscar("860002964"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA
	
	@Test
	public void buscarBooleanoTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(true, controladora.buscar("890300279"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA
	
	@Test
	public void buscarBooleanoTest3() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertFalse(controladora.buscar("123456789"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA
	
	@Test
	public void buscarBooleanoTest4() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(controladora.buscar("860035827"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA
	
	@Test
	public void buscarBooleanoTest5() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(true, controladora.buscar("860007738"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("860002964", controladora.buscarBanco("860002964").getId());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(controladora.buscarBanco("890300279").getNombre() == "Banco de occidente");
		
	}
	
	// ******************************************
	
	// TEST 3 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest3() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertNotNull(controladora.buscarBanco("860007738"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest4() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("860035827", controladora.buscarBanco("860035827").getId());
		
	}
	
	// ******************************************
	
	// TEST 5 PARA BUSCAR UN BANCO EN LA LISTA ENLAZADA RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest5() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(controladora.buscarBanco("860002964").getNombre() == "Banco de bogota");
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN BANCO DE LA LISTA ENLAZADA RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		controladora.eliminar("860002964");
		
		assertTrue(controladora.getPrimerBanco().getId().equalsIgnoreCase("890300279"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN BANCO DE LA LISTA ENLAZADA RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		controladora.eliminar("860007738");
		
		assertFalse(controladora.buscar("860007738"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA ELIMINAR UN BANCO DE LA LISTA ENLAZADA RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest3() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		controladora.agregar("Bancolombia", "890903938");
		
		controladora.eliminar("890903938");
		
		assertNull(controladora.buscarBanco("890903938"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA ELIMINAR UN BANCO DE LA LISTA ENLAZADA RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest4() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		assertEquals(true, controladora.eliminar("860035827"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA ELIMINAR UN BANCO DE LA LISTA ENLAZADA RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest5() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		controladora.agregar("Bancolombia", "890903938");
		
		controladora.agregar("Davivienda", "860034313");
		
		controladora.eliminar("890903938");
		
		assertNull(controladora.buscarBanco("890903938"));
		
		assertTrue(controladora.getPrimerBanco().getId().equalsIgnoreCase("860034313"));
		
	}
	
	// ---------------------------------------------------------------------------------------

}
