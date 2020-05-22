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
import modelo.Persona;

class PersonaTest {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE PERSONA
	
	Persona persona;
	
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
	
	//ESCENARIO NUMERO 1
	
	public void setup1() {
		
		persona = new Persona("Santiago", "1193419196", "Calle 49 a # 10 a 32", "3", "rodas@gmail.com");
		
	}
	
	// ******************************************
	
	// ESCENARIO NUMERO 2
	
	public void setup2() throws InformacionExisteExcepcion {
		
		setup1();
		
		persona.agregarServicio("Tarjeta de credito", 20000);
		
		persona.agregarServicio("Tarjeta debido", 10000);
		
		persona.agregarServicio("Seguro de vida", 50000);
		
	}
	
	// ******************************************
	
	// ESCENARIO NUMERO 3
	
	public void setup3() throws InformacionExisteExcepcion {
		
		setup1();
		
		persona.agregarBeneficioDescuento("Cine", "123", "rodas425", 10000);
		
		persona.agregarBeneficioDescuento("Restaurante", "456", "rodas425", 15000);
		
		persona.agregarBeneficioDescuento("Piscina", "789", "rodas425", 12000);
		
		
		persona.agregarBeneficioPromocion("2x1 Cine", "741", "sora2018", 15000);
		
		persona.agregarBeneficioPromocion("3x2 Restaurante", "852", "sora2018", 20000);
		
		persona.agregarBeneficioPromocion("5x4 Piscina", "963", "sora2018", 30000);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 AGREGAR SERVICIO
	
	@Test
	public void agregarServicioTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(persona.getRoot().getNombre() == "Tarjeta de credito");
		
	}
	
	// ******************************************
	
	// TEST 2 AGREGAR SERVICIO
	
	@Test
	public void agregarServicioTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(10000, persona.getRoot().getDerecha().getValor());
		
		assertEquals(50000, persona.getRoot().getIzquierda().getValor());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN SERVICIO EN EL SISTEMA
	
	@Test
	public void buscarServicioTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertTrue(persona.buscar("Tarjeta de credito"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN SERVICIO EN EL SISTEMA
	
	@Test
	public void buscarServicioTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(true, persona.buscar("Seguro de vida"));
		
		assertFalse(persona.buscar("Seguro para accidente de carro"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN SERVICIO (RETORNA EL SERVICIO O NULL EN EL CASO QUE NO EXISTA)
	
	@Test
	public void buscarServicioServicioTest1() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(20000, persona.buscarServicio("Tarjeta de credito").getValor());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN SERVICIO (RETORNA EL SERVICIO O NULL EN EL CASO QUE NO EXISTA)
	
	@Test
	public void buscarServicioServicioTest2() throws InformacionExisteExcepcion {
		
		setup2();
		
		assertEquals(50000, persona.buscarServicio("Seguro de vida").getValor());
		
		assertNull(persona.buscarServicio("Seguro para accidente de carro"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN SERVICIO DEL SISTEMA
	
	@Test
	public void eliminarServicioTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();
		
		assertTrue(persona.eliminar("Tarjeta de credito"));
		
		assertEquals(10000, persona.getRoot().getValor());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN SERVICIO DEL SISTEMA
	
	@Test
	public void eliminarServicioTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup2();

		assertTrue(persona.eliminar("Seguro de vida"));
		
		persona.agregarServicio("Seguro de accidente de carro", 100000);
		
		persona.eliminar("Seguro de accidente de carro");
		
		assertFalse(persona.buscar("Seguro de vida"));
		
		assertNull(persona.buscarServicio("Seguro de accidente de carro"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA AGREGAR UN BENEFICIO
	
	@Test
	public void agregarBeneficioTest1() throws InformacionExisteExcepcion {
		
		setup3();
		
		assertTrue(persona.getBeneficios().get(0).getNombre() == "Cine");
		
		assertTrue(persona.getBeneficios().get(3).getNombre() == "2x1 Cine");
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR UN BENEFICIO
	
	@Test
	public void agregarBeneficioTest2() throws InformacionExisteExcepcion {
		
		setup3();
		
		assertEquals(6, persona.getBeneficios().size());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN BENEFICIO, RETORNA UN BOOLEAN
	
	@Test
	public void buscarBeneficioTest1() throws InformacionExisteExcepcion {
		
		setup3();
		
		assertTrue(persona.buscarBeneficio("123"));
		
		assertTrue(persona.buscarBeneficio("741"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN BENEFICIO, RETORNA UN BOOLEAN
	
	@Test
	public void buscarBeneficioTest2() throws InformacionExisteExcepcion {
		
		setup3();
		
		assertFalse(persona.buscarBeneficio("951753"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN BENEFICIO, RETORNA EL BENEFICIO
	
	@Test
	public void buscarBeneficioBeneficioTest1() throws InformacionExisteExcepcion {
		
		setup3();
		
		assertEquals("rodas425", persona.buscarBeneficioBeneficio("123").getContrasena());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN BENEFICIO, RETORNA EL BENEFICIO
	
	@Test
	public void buscarBeneficioBeneficioTest2() throws InformacionExisteExcepcion {
		
		setup3();
		
		assertEquals(30000, persona.buscarBeneficioBeneficio("963").getValor());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN BENEFICIO
	
	@Test
	public void eliminarBeneficioTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup3();
		
		assertTrue(persona.eliminarBeneficio("741"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN BENEFICIO
	
	@Test
	public void eliminarBeneficioTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup3();
		
		assertTrue(persona.eliminarBeneficio("963"));
		
		persona.eliminarBeneficio("852");
		
		assertEquals(4, persona.getBeneficios().size());
		
	}
	
	// ---------------------------------------------------------------------------------------

}
