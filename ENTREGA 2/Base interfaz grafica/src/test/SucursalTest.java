package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Sucursal;

class SucursalTest {
	
	private Sucursal sucursal;
	
	public void setup1() {
		
		sucursal = new Sucursal();
		
	}
	
	@Test
	public void calcularMaximoTest() {
		
		setup1();
		
		assertEquals(sucursal.calcularMaximo(1000000), 20000000);
		
	}
	
	@Test
	public void calcularDeudaTest() {
		
		setup1();
		
		assertEquals(sucursal.calcularDeuda(1000000), 1100000);
		
	}
	
	@Test
	public void calcularCuotaTest() {
		
		setup1();
		
		assertEquals(sucursal.calcularCuota(2200000, 12), 183333);
		
	}

}
