/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package hilos;

import application.ControladoraEmpleado;
import javafx.application.Platform;

public class CuadradosHilo extends Thread {
	
	// ---------------------------------------------------------------------------------------
	
	private boolean validacion;
	
	// ---------------------------------------------------------------------------------------
	
	private ControladoraEmpleado controladora;

	// ---------------------------------------------------------------------------------------
	
	public CuadradosHilo(boolean validacion, ControladoraEmpleado controladora) {

		this.validacion = validacion;
		this.controladora = controladora;
		
	}
	
	// ---------------------------------------------------------------------------------------

	public boolean isValidacion() {
		return validacion;
	}
	
	public ControladoraEmpleado getControladora() {
		return controladora;
	}
	
	// ---------------------------------------------------------------------------------------

	public void setValidacion(boolean validacion) {
		this.validacion = validacion;
	}

	public void setControladora(ControladoraEmpleado controladora) {
		this.controladora = controladora;
	}
	
	// ---------------------------------------------------------------------------------------
	
	@Override
	public void run() {
		
		int contador = 0;
		
		while(validacion == true && contador <= 500) {
			
			try {
				
				controladora.girarCuadrados();
				
				contador ++;
				
				sleep(10);
				
			}catch(InterruptedException e) {
				
				// NADA IMPORTANTE AQUI
				
				e.printStackTrace();
				
			}
			
		}
		
		Platform.runLater(() -> controladora.mostrar());
		
	}
	
	// ---------------------------------------------------------------------------------------

}
