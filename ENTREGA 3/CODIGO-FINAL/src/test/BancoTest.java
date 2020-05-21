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

import modelo.Banco;

class BancoTest {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE BANCO
	
	Banco banco;
	
	// ---------------------------------------------------------------------------------------
	
	// ESCENARIO NUMERO 1
	
	public void setup1() {
		
		banco = new Banco("Banco de bogota", "860002964");
		
	}
	
	// ******************************************
	
	// ESCENARIO NUMERO 2
	
	public void setup2() {
		
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
	public void agregarTest1() {
		
		setup2();
		
		assertTrue(banco.getRoot().getNombre() == "Villacolombia");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest2() {
		
		setup2();
		
		assertEquals("85794", banco.getRoot().getDerecha().getId());
		
	}
	
	// ******************************************
	
	// TEST 3 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest3() {
		
		setup2();
		
		assertTrue(banco.getRoot().getDerecha().getIzquierda().getId().equalsIgnoreCase("45612"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest4() {
		
		setup2();
		
		assertEquals("96587", banco.getRoot().getDerecha().getDerecha().getId());
		
	}
	
	// ******************************************
	
	// TEST 5 PARA AGREGAR UN LUGAR AL ARBOL BINARIO 
	
	@Test
	public void agregarTest5() {
		
		setup2();
		
		assertTrue(banco.getRoot().getDerecha().getIzquierda().getDerecha().getId().equalsIgnoreCase("74158"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest1() {
		
		setup2();
		
		assertTrue(banco.buscar("12345"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest2() {
		
		setup2();
		
		assertEquals(true, banco.buscar("85794"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest3() {
		
		setup2();
		
		assertTrue(banco.buscar("45612"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest4() {
		
		setup2();
		
		assertEquals(false, banco.buscar("50000"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO
	
	@Test
	public void buscarBooleanTest5() {
		
		setup2();
		
		assertEquals(true, banco.buscar("74158"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest1() {
		
		setup2();
		
		assertEquals("Villacolombia", banco.buscarLugar("12345").getNombre());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest2() {
		
		setup2();
		
		assertTrue(banco.buscarLugar("85794").getDireccion().equalsIgnoreCase("Carrerra 12 C # 28 - 48"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest3() {
		
		setup2();
		
		assertEquals("elingenio@gmail.com", banco.buscarLugar("45612").getEmail());
		
	}
	
	// ******************************************
	
	// TEST 4 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest4() {
		
		setup2();
		
		assertNull(banco.buscarLugar("50000"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA BUSCAR UN LUGAR EN EL ARBOL BINARIO RETORNANDO EL OBJETO BUSCADO
	
	@Test
	public void buscarBancoTest5() {
		
		setup2();
		
		assertTrue(banco.buscarLugar("74158").getEstratoEconomico().equalsIgnoreCase("6"));
		
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest1() {
		
		setup2();
		
		banco.eliminar("45612");
		
		assertFalse(banco.buscar("45612"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest2() {
		
		setup2();
		
		banco.eliminar("74158");
		
		assertEquals(false, banco.buscar("74158"));
		
	}
	
	// ******************************************
	
	// TEST 3 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest3() {
		
		setup1();
		
		banco.agregar("Bancolombia", "90000", "Calle 6 a # 10 a 32", "4", "banco@gmail.com");
		
		assertTrue(banco.buscar("90000"));
		
		banco.eliminar("90000");
		
		assertFalse(banco.buscar("90000"));
		
	}
	
	// ******************************************
	
	// TEST 4 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest4() {
		
		setup2();
		
		banco.eliminar("12345");
		
		assertNotNull(banco.getRoot());
		
		assertTrue(banco.getRoot().getId().equalsIgnoreCase("85794"));
		
	}
	
	// ******************************************
	
	// TEST 5 PARA ELIMINAR UN LUGAR DEL ABB RETORNANDO BOOLEAN
	
	@Test
	public void eliminarTest5() {
		
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
