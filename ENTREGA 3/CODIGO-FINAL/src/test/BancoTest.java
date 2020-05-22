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
import modelo.Banco;

class BancoTest {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE BANCO
	
	Banco banco;
	
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
		
		banco = new Banco("Banco de bogota", "860002964");
		
	}
	
	// ******************************************
	
	// ESCENARIO NUMERO 2
	
	public void setup2() throws InformacionExisteExcepcion {
		
		setup1();
		
		banco.agregar("Villacolombia", "12345", "Calle 49 A # 10 a 32", "3", "villacolombia@gmail.com");
		
		banco.agregar("La base", "85794", "Carrerra 12 C # 28 - 48", "3", "labase@gmail.com");
		
		banco.agregar("El ingenio", "45612", "Calle 92 B # 10 - 85", "4", "elingenio@gmail.com");
		
		banco.agregar("Valle del lili", "96587", "Carrera 18 A # 10 Bis 45", "5", "vallelili@gmail.com");
		
		banco.agregar("El mameyal", "74158", "kilometro 1 via Cristo rey", "6", "mameyal@gmail.com");
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 

	@Test
	public void agregarTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(banco.getRoot().getNombre() == "Villacolombia");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("85794", banco.getRoot().getDerecha().getId());
		
	}
	
	// ******************************************
	
	// TEST 3 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest3() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(banco.getRoot().getDerecha().getIzquierda().getId().equalsIgnoreCase("45612"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest4() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("96587", banco.getRoot().getDerecha().getDerecha().getId());
		
	}
	
	// ******************************************
	
	// TEST 5 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest5() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(banco.getRoot().getDerecha().getIzquierda().getDerecha().getId().equalsIgnoreCase("74158"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(banco.buscar("12345"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(true, banco.buscar("85794"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest3() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(banco.buscar("45612"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest4() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(false, banco.buscar("50000"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest5() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(true, banco.buscar("74158"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("Villacolombia", banco.buscarLugar("12345").getNombre());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(banco.buscarLugar("85794").getDireccion().equalsIgnoreCase("Carrerra 12 C # 28 - 48"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest3() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals("elingenio@gmail.com", banco.buscarLugar("45612").getEmail());
		
	}
	
	// ******************************************
	
	// TEST 4 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest4() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertNull(banco.buscarLugar("50000"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest5() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(banco.buscarLugar("74158").getEstratoEconomico().equalsIgnoreCase("6"));
		
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		banco.eliminar("45612");
		
		assertFalse(banco.buscar("45612"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		banco.eliminar("74158");
		
		assertEquals(false, banco.buscar("74158"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest3() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		banco.agregar("Bancolombia", "90000", "Calle 6 a # 10 a 32", "4", "banco@gmail.com");
		
		assertTrue(banco.buscar("90000"));
		
		banco.eliminar("90000");
		
		assertFalse(banco.buscar("90000"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest4() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		banco.eliminar("12345");
		
		assertNotNull(banco.getRoot());
		
		assertTrue(banco.getRoot().getId().equalsIgnoreCase("85794"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest5() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		banco.eliminar("12345");
		
		banco.eliminar("45612");
		
		banco.eliminar("74158");
		
		assertFalse(banco.buscar("12345"));
		
		assertFalse(banco.buscar("45612"));
		
		assertFalse(banco.buscar("74158"));
				
	}
	
	// ---------------------------------------------------------------------------------------

}
