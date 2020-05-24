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
		
		persona.agregarBeneficioDescuento("Cine", "123", "rodas425", 10000); // (1) - (4)
		
		persona.agregarBeneficioDescuento("Restaurante", "456", "rodas425", 15000); // (4) - (6)
		
		persona.agregarBeneficioDescuento("Piscina", "789", "rodas425", 12000); // (2) - (5)
		
		
		persona.agregarBeneficioPromocion("2x1 Cine", "741", "sora2018", 15000); // (3) - (1)
		
		persona.agregarBeneficioPromocion("3x2 Restaurante", "852", "sora2018", 20000); // (5) - (2)
		
		persona.agregarBeneficioPromocion("5x4 Piscina", "963", "sora2018", 30000); // (6) - (3)
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// ESCENARIO NUMERO 4
	
	public void setup4() throws InformacionExisteExcepcion {
		
		setup1();
		
		persona.agregarSalud("Imbanaco", "123", "Calle 5", "4", "imbanaco@gmail.com"); // (5) - (1)
		
		persona.agregarSalud("Sura", "456", "Calle 5 con 47", "4", "sura@gmail.com"); // (6) - (5)
		
		persona.agregarSalud("Coomeva", "789", "Carrera 9", "3", "coomeva@gmail.com"); // (3) - (6)
		
		
		persona.agregarArl("Colpatria", "147", "Calle 6", "4", "colpatria@gmail.com"); // (2) - (2)
		
		persona.agregarArl("Equidad", "258", "Kilometro 1", "3", "equidad@gmail.com"); // (4) - (3)
		
		persona.agregarArl("Colmena", "369", "Calle 7", "3", "colmena@gmail.com"); // (1) - (4)
		
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
		
		assertTrue(persona.getBeneficios().get(2).getNombre() == "2x1 Cine");
		
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
	
	// TEST 1 PARA AGREGAR UN SEGURO DE TIPO SALUD
	
	public void agregarSeguroSaludTest1() throws InformacionExisteExcepcion {
		
		setup4();
		
		assertTrue(persona.getSeguros().get(0).getNombre() == "Imbanaco");
		
		assertEquals("456", persona.getSeguros().get(1).getId());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA AGREGAR UN SEGURO DE TIPO ARL
	
	public void agregarSeguroARLTest1() throws InformacionExisteExcepcion {
		
		setup4();
		
		assertTrue(persona.getSeguros().get(3).getNombre() == "Colpatria");
		
		assertEquals("258", persona.getSeguros().get(4).getId());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN SEGURO RETORNA UN BOOLEAN
	
	public void buscarSeguroTest1() throws InformacionExisteExcepcion {
		
		setup4();
		
		assertTrue(persona.buscarSeguro("456"));
		
		assertFalse(persona.buscarSeguro("8459614586"));
		
	}
	
	// ******************************************
	
	// TEST 2 PARA BUSCAR UN SEGURO RETORNA UN BOOLEAN
	
	public void buscarSeguroTest2() throws InformacionExisteExcepcion {
		
		setup4();
		
		assertTrue(persona.buscarSeguro("147"));
		
		assertFalse(persona.buscarSeguro("0258465814269"));
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA BUSCAR UN SEGURO RETORNA EL SEGURO
	
	public void buscarSeguroSeguroTest1() throws InformacionExisteExcepcion {
		
		setup4();
		
		assertNotNull(persona.buscarSeguroSeguro("789"));
		
		assertEquals("Imbanaco", persona.buscarSeguroSeguro("123").getNombre());
		
	}
	
	// ******************************************
	
	// TEST 1 PARA BUSCAR UN SEGURO RETORNA EL SEGURO
	
	public void buscarSeguroSeguroTest2() throws InformacionExisteExcepcion {
		
		setup4();
		
		assertNotNull(persona.buscarSeguroSeguro("258"));
		
		assertEquals("Colmena", persona.buscarSeguroSeguro("369").getNombre());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// TEST 1 PARA ELIMINAR UN SEGURO RETORNA UN BOOLEAN
	
	public void eliminarSeguroTest1() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup4();
		
		persona.eliminarSeguro("123");
		
		assertEquals(5, persona.getSeguros().size());
		
	}
	
	// ******************************************
	
	// TEST 2 PARA ELIMINAR UN SEGURO RETORNA UN BOOLEAN
	
	public void eliminarSeguroTest2() throws InformacionExisteExcepcion, NoExisteInformacionExcepcion {
		
		setup1();
		
		persona.agregarSalud("Oftamologia", "753", "Carrera 78", "4", "oftamologia@gmail.com");
		
		persona.agregarArl("Sura Arl", "951", "Kilometro 2", "4", "suraArl@gmail.com");
		
		assertEquals(2, persona.getSeguros().size());
		
		persona.eliminarSeguro("753");
		
		assertEquals(1, persona.getSeguros().size());
		
		persona.eliminarSeguro("951");
		
		assertNull(persona.buscarSeguroSeguro("951"));
		
		assertEquals(0, persona.getSeguros().size());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO TEST PARA COMPROBAR EL METODO DE ORDENAMIENTO SELECCION (VALOR)
	
	@Test
	public void seleccionValor() throws InformacionExisteExcepcion {
		
		setup3();
		
		persona.seleccionValor();
		
		assertEquals("Cine", persona.getBeneficios().get(0).getNombre());
		
		assertEquals("Piscina", persona.getBeneficios().get(1).getNombre());
		
		assertEquals("Restaurante", persona.getBeneficios().get(3).getNombre());
		
		assertEquals("5x4 Piscina", persona.getBeneficios().get(5).getNombre());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO TEST PARA COMPROBAR EL METODO DE ORDENAMIENTO SELECCION (NOMBRE)
	
	@Test
	public void seleccionNombre() throws InformacionExisteExcepcion {
		
		setup3();
		
		persona.seleccionNombre();
		
		assertEquals("2x1 Cine", persona.getBeneficios().get(0).getNombre());
		
		assertEquals("5x4 Piscina", persona.getBeneficios().get(2).getNombre());
		
		assertEquals("Piscina", persona.getBeneficios().get(4).getNombre());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO TEST PARA COMPROBAR EL METODO DE ORDENAMIENTO INSERCION (NOMBRE)
	
	@Test
	public void insercionNombre() throws InformacionExisteExcepcion {
		
		setup4();
		
		persona.insercionNombre();
		
		assertEquals("colmena@gmail.com", persona.getSeguros().get(0).getEmail());
		
		assertEquals("coomeva@gmail.com", persona.getSeguros().get(2).getEmail());
		
		assertEquals("imbanaco@gmail.com", persona.getSeguros().get(4).getEmail());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO TEST PARA COMPROBAR EL METODO DE ORDENAMIENTO INSERCION (ID)
	
	@Test
	public void insercionId() throws InformacionExisteExcepcion {
		
		setup4();
		
		persona.insercionId();
		
		assertEquals("Calle 6", persona.getSeguros().get(1).getDireccion());
		
		assertEquals("Calle 7", persona.getSeguros().get(3).getDireccion());
		
		assertEquals("Carrera 9", persona.getSeguros().get(5).getDireccion());
		
	}
	
	// ---------------------------------------------------------------------------------------

}
