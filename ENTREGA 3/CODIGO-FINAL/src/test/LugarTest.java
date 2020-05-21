package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Lugar;

class LugarTest {
	
	Lugar lugar;
	
	public void setup1() {
		
		lugar = new Lugar("Villacolombia", "12345", "Calle 49 A # 10 a 32", "3", "villacolombia@gmail.com");
		
	}
	
	public void setup2() {
		
		setup1();
		
		lugar.agregarCliente("Santiago", "1193419196", "Calle 49 a # 10 a 32", "3", "srodas@gmail.com", "rodas425");
		
		lugar.agregarCliente("Nolberto", "77108854", "Calle 49 a # 10 a 32", "5", "nolber@gmail.com", "nolbertor");
		
		
		lugar.agregarEmpleado("Miguel", "123", "Cali", "3", "No tiene", "Informacion", 1000);
		
		lugar.agregarEmpleado("David", "789", "Bogota", "4", "No tiene", "Caja", 2000);
		
	}

	@Test
	public void agregarClienteTest1() {
		
		setup2();
		
		assertTrue(lugar.getPrimerCliente().getNombre() == "Santiago");
		
	}
	
	@Test
	public void agregarClienteTest2() {
		
		setup2();
		
		assertEquals("77108854", lugar.getPrimerCliente().getSiguiente().getId());
		
	}
	
	@Test
	public void agregarEmpleadoTest1() {
		
		setup2();
		
		assertTrue(lugar.getPrimerEmpleado().getEstratoEconomico() == "3");
		
	}
	
	@Test
	public void agregarEmpleadoTest2() {
		
		setup2();
		
		assertEquals("David", lugar.getPrimerEmpleado().getSiguiente().getNombre());
		
	}

}
